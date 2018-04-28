import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author alka
 *
 */
public class Display extends JPanel implements Runnable{

	/**
	 * 
	 */
	public Display() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		
	}
	public void initializePanel () {}
	public void initializeAssets() {
		Bat bat = new Bat();
		Prize prize = new Prize();
		Obstacle obstacle = new Obstacle();
	}
	public void paintComponent(Graphics g) {}
	public void animation() {}
	public void keyPressed(KeyEvent e) {} 


}
