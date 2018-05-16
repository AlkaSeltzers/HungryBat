import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;




/**
 * A Display is a JPanel that implements Runnable and that can initialize its panel and Assets, run its threads, paint components, animate itself, and respond to a keypress 
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Display extends JPanel implements Runnable{
	Bat bat;
	Prize rootPrize;
	Obstacle rootObstacle;
	Thread thread;
	 private Dimension dimension;

	/**
	 * Constructs a Display
	 */
	public Display() {
		// TODO Auto-generated constructor stub
		initializePanel ();
		initializeAssets();
		initializeGame();
		
		 
	              
	}
	/** 
	 * Runs the threads
	 */
	@Override
	public void run() {
		while(true) {
			animation();		        
			repaint();
			try {
				thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/** 
	 * Initializes the panel
	 */
	public void initializePanel () {
		setFocusable(true);
		dimension = new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        setBackground(Color.blue);
     }
	
	
	public void initializeGame() {
		thread = new Thread(this);
		thread.start();
		addKeyListener(new GameKeyListener());
	}

	/**
	 * Initializes the Assets
	 */
	public void initializeAssets() {
		bat = new Bat();	
		rootPrize = new Prize();
		rootObstacle = new Obstacle();
		
	}
	private void drawBackground(Graphics g) {
	    g.setColor(Color.blue);
        g.fillRect(0, 0, dimension.width, dimension.height);
        g.setColor(Color.green);
	}
	/** 
	 * Paints the components on the panel
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBackground(g);
		//System.out.println("before");
		drawBat(g);
		//System.out.println("after");
		drawPrize(g);   
		drawObstacle(g);
		Toolkit.getDefaultToolkit().sync();
        g.dispose();
	}
	/**
	 * Does the animation
	 */
	public void animation() {
		bat.fall();	
		// Check collisions with prize
		ArrayList<Prize> prizes = rootPrize.getPrizes();
		
		Iterator iterator = rootPrize.getPrizes().iterator();
		int countPrizeRemoved = 0;
		while (  iterator.hasNext()) {
			Prize prize =  (Prize) iterator.next();
			prize.movePrize();
			if(prize.outOfScope(prize)) {
				iterator.remove();
				countPrizeRemoved++;
			} else {
				if (prize.getRectangleBoundary().intersects(bat.getRectangleBoundary())) {
					 //System.out.printf(" Collided: %s , Pos (%d,%d) \n",prize.getImage(), prize.getPosition().getxPos(),prize.getPosition().getyPos());
					rootPrize.setRewards(rootPrize.getRewards()+1);
					iterator.remove();
					countPrizeRemoved++;
				}
			
			}
		}
		int i = 0;
		while (i++ < countPrizeRemoved) {
			rootPrize.addPrize();
		}
		 iterator = rootObstacle.getObstacles().iterator();
			
		while (  iterator.hasNext()) {
			Obstacle obstacle =  (Obstacle) iterator.next();
			obstacle.moveObstacle();
			if (obstacle.outOfScope(obstacle) ){
				iterator.remove();
				
				
			} else {
				if (obstacle.getRectangleBoundary().intersects(bat.getRectangleBoundary())) {
					 //System.out.printf(" Collided: %s , Pos (%d,%d) \n",obstacle.getImage(), obstacle.getPosition().getxPos(),obstacle.getPosition().getyPos());
					obstacle.setScore(obstacle.getScore()+1);
					iterator.remove();
					
				}
			}
		} 
		
	}
	/**
	 * Bounces the bat upon a keypress
	 */
	public void keyPressed(KeyEvent e) {
		bat.bounce();
	}
	
	private void drawBat(Graphics g) {
		g.drawImage(bat.getImage(),bat.getPosition().getxPos(),bat.getPosition().getyPos(),this);
	}
	private void drawPrize(Graphics g) {
		ArrayList<Prize> prizes = rootPrize.getPrizes();
		Iterator iterator = rootPrize.getPrizes().iterator();
		while (  iterator.hasNext()) {
			Prize prize =  (Prize) iterator.next();
			g.drawImage(prize.getImage(),prize.getPosition().getxPos(),prize.getPosition().getyPos(),this);
			//System.out.printf(" Image: %s , Pos (%d,%d) \n",prize.getImage(), prize.getPosition().getxPos(),prize.getPosition().getyPos());
		}
	}
	
	private void drawObstacle(Graphics g) {
		ArrayList<Obstacle> obstacles = rootObstacle.getObstacles();
		
		Iterator iterator = rootObstacle.getObstacles().iterator();
		while (  iterator.hasNext()) {
			Obstacle obstacle =  (Obstacle) iterator.next();
			g.drawImage(obstacle.getImage(),obstacle.getPosition().getxPos(),obstacle.getPosition().getyPos(),this);
			//System.out.printf(" Image: %s , Pos (%d,%d) \n",prize.getImage(), prize.getPosition().getxPos(),prize.getPosition().getyPos());
		}
		
	}
	public class GameKeyListener  implements KeyListener {
		
		public void keyPressed(KeyEvent keyEvent) {
			if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER ) {
				System.exit(0);
			}
			bat.bounce();
		}
		
		public void keyReleased(KeyEvent keyEvent) {
			
		}
		
		public void keyTyped(KeyEvent keyEvent) {
			
		}
	}
}
