import java.awt.image.BufferedImage;

/**
 * An Asset is an Object that maintains information about its position and image and knows how to set and get its position and image.
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */


public class Asset {
	private Position myPosition;
	private BufferedImage image;
	
	/**
	 * Constructs an Asset at (0,0)
	 */
	public Asset() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Constructs an Asset at position
	 * @param position	assigns position to myPosition
	 */
	public Asset(Position position) {
		// TODO Auto-generated constructor stub
		this.myPosition = position;
	}
	/**
	 * Returns the position of the Asset
	 * @return the position
	 */
	public Position getPosition() {
		return myPosition;
	}

	/**
	 * Sets the position of the Asset
	 * @param position	assigns position to myPosition
	 */
	public void setPosition(Position position) {
		this.myPosition = position;
	}

	/**
	 * Returns the image associated with the Asset
	 * @return image
	 */
	public BufferedImage getImage() {
		return image;
	}
	/**
	 * Sets the image to img
	 * @param img	assigns img to image
	 */
	public void setImage(BufferedImage img) {
		this.image = img;
	}




}
