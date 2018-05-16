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
		
		if (prizes == null ) {
			initialize ();
		}
	}


	/**
	 * @return the prizes
	 */
	public ArrayList<Prize> getPrizes() {
		return prizes;
	}


	/**
	 * @param prizes the prizes to set
	 */
	public void setPrizes(ArrayList<Prize> prizes) {
		Prize.prizes = prizes;
	}

	/**
	 * @return the rewards
	 */
	public int getRewards() {
		return rewards;
	}


	/**
	 * @param rewards the rewards to set
	 */
	public void setRewards(int rewards) {
		Prize.rewards = rewards;
	}

	/**
	 * initializes a set of prizes at random positions
	 */
	public void initialize (){
		//loop for number of prizes
		int i = 0;
		 prizes = new ArrayList<Prize>();
		while( i++ < Constants.MAX_PRIZES) {
			addPrize();	
			
		}
		
	}
	/**
	 * adds a prize at a random location
	 */
	public void addPrize(){
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		
		
		int xPos = CommonUtils.getRandomInt(Constants.FRAME_WIDTH/2, Constants.FRAME_WIDTH);
		int yPos = CommonUtils.getRandomInt(50, Constants.FRAME_HEIGHT-50);
		Position position = new Position(xPos,yPos);
		
		Prize prize = new Prize();
		prize.setPosition(position);
		prize.setImage(CommonUtils.loadImage("prize.png"));

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
	 *  moves their x-coordinates
	 */
	public void movePrize() {
		//move the x position coordinates 
		getPosition().setxPos(getPosition().getxPos()-1);
	}
	

}
