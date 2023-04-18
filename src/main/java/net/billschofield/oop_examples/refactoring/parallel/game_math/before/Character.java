package net.billschofield.oop_examples.refactoring.parallel.game_math.before;

public class Character {
	private final String name;
	private double heading;
	private double x;
	private double y;

	public Character(String name, double heading, double x, double y) {
		this.name = name;
		this.heading = heading;
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setHeading(double heading) {
		this.heading = heading;
	}

	public double getHeading() {
		return heading;
	}

	public String toString(){
		return "Character: " + name + ", Heading: " + heading + ",  Position: (" + x + ", " + y + ")";
	}
}
