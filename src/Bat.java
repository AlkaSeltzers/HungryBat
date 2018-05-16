import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * 
 */

/** A Bat is an Asset that maintains information about its position and knows how to bounce and fall
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Bat extends Asset {

	/**
	 * Constructs a bat at (0,0) using initialize method
	 */
	public Bat() {

		initialize();
	}
	/*
	 * Initializes a bat at Position (0,0)
	 */
	public void  initialize(){
		Position batPos = new Position(100,100);
		setPosition(batPos);
		setImage(CommonUtils.loadImage("bat.gif"));
			
	}
	/*
	 * Makes the bat bounce upwards by increasing y-coordinate
	 */
	public void bounce(){
		getPosition().setyPos(getPosition().getyPos()-Constants.BOUNCE_HEIGHT);
	}
	/*
	 * Makes the bat free fall by decreasing y-coordinate
	 */
	public void fall(){
		getPosition().setyPos(getPosition().getyPos()+1);
	}
}
