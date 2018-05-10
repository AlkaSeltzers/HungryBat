/**
 * 
 */

/** A Bat is an Asset that maintains information about its position and knows how to bounce and fall
 * @author alka
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
		Position batPos = new Position(0,0);
		
	}
	/*
	 * Makes the bat bounce upwards by increasing y-coordinate
	 */
	public void bounce(){
		
	}
	/*
	 * Makes the bat free fall by decreasing y-coordinate
	 */
	public void fall(){
		
	}

}
