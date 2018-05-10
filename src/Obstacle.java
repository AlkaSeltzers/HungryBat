import java.util.ArrayList;
/**
 * An Obstacle is an Asset that maintains lists of its positions and constituent barriers. An Obstacle knows how to initialize, add a barrier, remove a barrier, and move.
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class Obstacle extends Asset {
	public static ArrayList<Obstacle> barriers;
	public static ArrayList<Position> xypositions;
	public static int score;
	/**
	 * Constructs an Obstacle
	 */
	public Obstacle() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * initializes barriers of various/random lengths
	 */
	public void initialize (){}
	/**
	 * adds a barrier
	 */
	private void addObstacle() {
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		Position position = new Position(0,0);
		Obstacle obstacle = new Obstacle();
		barriers.add(obstacle);

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
