import java.util.ArrayList;

/**
 * A Prize is an Asset that maintains information about its individual rewards and its positions. A Prize knows how to add, remove, and move rewards.
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Prize extends Asset {
	public static ArrayList<Prize> prizes;
	public static ArrayList<Position> xypositions;
	public static int rewards;
	/**
	 * Constructs a Prize 
	 */
	public Prize() {
		initialize ();
	}


	/**
	 * initializes a set of prizes at random positions
	 */
	public void initialize (){
		//loop for number of prizes
		int i = 0;
		while( i < Constants.MAX_PRIZES) {
			addPrize();
			

		}
		
	}
	/**
	 * adds a prize at a random location
	 */
	private void addPrize(){
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		Position position = new Position(0,0);
		Prize prize = new Prize();
		prizes.add(prize);
	}
	/**
	 * removes a specified prize
	 * @param prize	removes prize from list
	 */
	private void removePrize(Prize prize) {
		//logic to remove specified value from list
		
	}
	/**
	 * loops through the prizes and moves their x-coordinates
	 */
	public void movePrize() {
		//iterate through the prizes and move the x position coordinates 
		addPrize();
		removePrize();
	}
	

}
