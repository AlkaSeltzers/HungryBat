import java.util.ArrayList;

/**
 * A Prize is an Asset that maintains information about its individual rewards and its positions. A Prize knows how to add, remove, and move rewards.
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Prize extends Asset {
	public static ArrayList<Prize> rewards;
	public static ArrayList<Position> xypositions;
	public static int rewards;
	/**
	 * Constructs a Prize 
	 */
	public Prize() {
		initialize ();
	}


	/**
	 * initializes a set of rewards at random positions
	 */
	public void initialize (){
		//loop for number of prizes
		int i = 0;
		while( i < Constants.MAX_PRIZES) {
			addReward();
			

		}
		
	}
	/**
	 * adds a reward at a random location
	 */
	private void addReward(){
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		Position position = new Position(0,0);
		Prize prize = new Prize();
		prizes.add(prize);
	}
	/**
	 * removes a specified reward
	 * @param prize	removes reward from list
	 */
	private void removeReward(Prize prize) {
		//logic to remove specified value from list
		
	}
	/**
	 * loops through the rewards and moves their x-coordinates
	public void movePrize() {
		//iterate through the rewards and move the x position coordinates 
		addReward();
		removeReward();
	}
	

}
