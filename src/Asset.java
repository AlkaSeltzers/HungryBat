import java.awt.image.BufferedImage;

/**
 * 
 */

/**
 * @author alka
 *
 */


public class Asset {
	private Position position;
	private BufferedImage image;
	
	/**
	 * 
	 */
	public Asset() {
		// TODO Auto-generated constructor stub
	}
	
	public Asset(Position position) {
		// TODO Auto-generated constructor stub
		this.position = position;
	}
	/**
	 * @return the postion
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param postion the postion to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * 
	 */
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}




}
