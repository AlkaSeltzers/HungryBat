

/**
 * A Position is an Object that maintains information about its x and y-coordinates. A Position knows how to get and set its x and y-coordinates. 
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Position {
	private int xPos;
	private int yPos;
	
	/**
	 * Constructs a Position at (0,0)
	 */
	public Position() {
		this.xPos = 0;
		this.yPos = 0;
	}
	/**
	 * Constructs a Position at (xPos, yPos)
	 * @param xPos	initial x-coordinate
	 * @param yPos	initial y-coordinate 
	 */
	public Position(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	/**
	 * returns the x-coordinate of the Position
	 * @return	xPos
	 */
	 
	public int getxPos() {
		return xPos;
	}
        /**
	 * sets the x-coordinate of the Position to x
	 * @param x	assigns x to xPos
	 */
	public void setxPos(int x) {
		this.xPos = x;
	}
        /**
	 * returns the y-coordinate of the Position
	 * @return	yPos
	 */
	public int getyPos() {
		return yPos;
	}
	/**
	 * sets the y-coordinate of the Position to y
	 * @param y	assigns y to yPos
	 */
	public void setyPos(int y) {
		this.yPos = y;
	}
}
