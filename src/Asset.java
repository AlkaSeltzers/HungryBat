import java.awt.image.BufferedImage;

/**
 * 
 */

/**
 * @author alka
 *
 */


public class Asset {
	private Position postion;
	private BufferedImage image;
	
	/**
	 * 
	 */
	public Asset() {
		// TODO Auto-generated constructor stub
	}
	
	public Asset(Position postion) {
		// TODO Auto-generated constructor stub
		this.postion = postion;
	}
	/**
	 * @return the postion
	 */
	public Position getPostion() {
		return postion;
	}

	/**
	 * @param postion the postion to set
	 */
	public void setPostion(Position postion) {
		this.postion = postion;
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
