import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

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
	Prize prize;
	Obstacle obstacle;
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
	
	
	public void initializePanel () {
		setFocusable(true);
		dimension = new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        setBackground(Color.blue);
     }
	
	
	public void initializeGame() {
		thread = new Thread(this);
		thread.start();
		
	}
	/** 
	 * Initializes the panel
	 */
	public void initializePanel () {}
	/**
	 * Initializes the Assets
	 */
	public void initializeAssets() {
		bat = new Bat();	
		prize = new Prize();
		obstacle = new Obstacle();
		
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
		drawBat(g);
		Toolkit.getDefaultToolkit().sync();
        g.dispose();
	}
	/**
	 * Does the animation
	 */
	public void animation() {
		bat.fall();		
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


}
