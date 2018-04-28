import java.util.ArrayList;

/**
 * 
 */

/**
 * @author alka
 *
 */
public class Prize extends Asset {
	public static ArrayList<Prize> prizes;
	public static ArrayList<Position> xypositions;
	public static int rewards;
	/**
	 * 
	 */
	public Prize() {
		initialize ();
	}


	
	public void initialize (){
		//loop for number of prizes
		int i = 0;
		while( i < Constants.MAX_PRIZES) {
			addPrize();
			

		}
		
	}
	private void addPrize(){
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		Position position = new Position(0,0);
		Prize prize = new Prize();
		prizes.add(prize);
	}
	private void removePrize(Prize prize) {
		//logic to remove specified value from list
		
	}
	public void movePrize() {
		//iterate through the prizes and move the x position coordinates 
	}
	

}
