import java.util.ArrayList;
/**
 * An Obstacle is an Asset that maintains lists of its positions and constituent barriers. An Obstacle knows how to initialize, add a barrier, remove a barrier, and move.
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Obstacle extends Asset {
	public static ArrayList<Obstacle> obstacles;
	public static ArrayList<Position> xypositions;
	public static int score;
	/**
	 * Constructs an Obstacle
	 */
	public Obstacle() {
		if (obstacles == null ) {
			initialize ();
		}
	}

	/**
	 * @return the obstacles
	 */
	public ArrayList<Obstacle> getObstacles() {
		return obstacles;
	}

	/**
	 * @param obstacles the obstacles to set
	 */
	public void setObstacles(ArrayList<Obstacle> obstacles) {
		Obstacle.obstacles = obstacles;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		Obstacle.score = score;
	}

	/**
	 * initializes barriers of various/random lengths
	 */
	public void initialize (){
		//loop for number of obstacles
		int i = 0;
		obstacles = new ArrayList<Obstacle>();
		while( i < Constants.MAX_OBSTACLES) {
			addObstacle();
		}
	}
	/**
	 * adds an obstacle
	 */
	private void addObstacle() {
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		
		int xPos = 600;
		int yPos = CommonUtils.getRandomInt(100, Constants.FRAME_HEIGHT/2);
		Position position = new Position(xPos,yPos);	
		Obstacle obstacle = new Obstacle();
		obstacle.setPosition(position);
		obstacle.setImage(CommonUtils.loadImage("pillar.jpg"));

		obstacles.add(obstacle);

	}
	/**
	 * removes a barrier
	 */
	private void removeObstacle() {}
	/**
	 * changes the barriers' coordinates periodically to give the impression of movement
	 */
	public void moveObstacle() {
		addObstacle();
		removeObstacle();
	}

}
