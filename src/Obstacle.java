import java.util.ArrayList;
/**
 * 
 */

/**
 * @author alka
 *
 */
public class Obstacle extends Asset {
	public static ArrayList<Obstacle> obstacles;
	public static ArrayList<Position> xypositions;
	public static int score;
	/**
	 * 
	 */
	public Obstacle() {
		// TODO Auto-generated constructor stub
	}


	
	public void initialize (){}
	private void addObstacle() {
		//random algorithm to determine prize location
		//0, 0 is result of some algorithm needs to be changed
		Position position = new Position(0,0);
		Obstacle obstacle = new Obstacle();
		obstacles.add(obstacle);

	}
	private void removeObstacle() {}
	public void moveObstacle() {}

}
