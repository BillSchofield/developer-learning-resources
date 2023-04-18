package net.billschofield.oop_examples.refactoring.parallel.game_math.after;

import static java.lang.Math.PI;
import static net.billschofield.oop_examples.refactoring.parallel.game_math.after.Vector2.*;

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
		Vector2 playerDirectionVector = directionVectorFromHeading(playerHeading);
		Vector2 vectorToTarget = subtract(position, target.getPosition());
		heading = angleBetweenVectors(playerDirectionVector, vectorToTarget);
	}
	public void moveForward() {
		position = add(position, directionVectorFromHeading(heading));
	}

	public Vector2 getPosition() {
		return position;
	}

	public String toString(){
		return "Character: " + name + ", Heading: " + heading * 180/ PI + ",  Position: (" + position.getX() + ", " + position.getY() + ")";
	}
}
