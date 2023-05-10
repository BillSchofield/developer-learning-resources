package developer_learning_resources.coding_practices.refactoring.parallel.game_math.after;

import static java.lang.Math.PI;

public class Character {
	private final String name;
	private double heading;
	private Vector2 position;

	public Character(String name, double heading, Vector2 position) {
		this.name = name;
		this.heading = heading;
		this.position = position;
	}

	public void faceTarget(Character target) {
		double playerHeading = heading;
		Vector2 playerDirectionVector = Vector2.directionVectorFromHeading(playerHeading);
		Vector2 vectorToTarget = Vector2.subtract(position, target.getPosition());
		heading = Vector2.angleBetweenVectors(playerDirectionVector, vectorToTarget);
	}
	public void moveForward() {
		position = Vector2.add(position, Vector2.directionVectorFromHeading(heading));
	}

	public Vector2 getPosition() {
		return position;
	}

	public String toString(){
		return "Character: " + name + ", Heading: " + heading * 180/ PI + ",  Position: (" + position.getX() + ", " + position.getY() + ")";
	}
}
