import javax.swing.JFrame;

/**
 * Driver Class
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Driver extends JFrame{

	/**
	 * Creates a JFrame
	 */
	public Driver() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Driver driver = new Driver();
		Display display = new Display();
		driver.add(display);
		

	}

}
