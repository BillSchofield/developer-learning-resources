package developer_learning_resources.coding_practices.refactoring.parallel.game_math.before;

import java.util.Objects;

import static java.lang.Math.*;

public class Character {
	private final String name;
	private double heading;
	private double x;
	private double y;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Character character = (Character) o;
		return Double.compare(character.heading, heading) == 0 && Double.compare(character.x, x) == 0 && Double.compare(character.y, y) == 0 && Objects.equals(name, character.name);
	}

	@Override
	public int hashCode() {
		Object[] a = new Object[]{name, heading, x, y};
		if (a == null)
		    return 0;

		int result = 1;

		for (Object element : a)
		    result = 31 * result + (element == null ? 0 : element.hashCode());

		return result;
	}

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
		return "Character: " + name + ", Heading: " + toDegrees(heading) + ",  Position: (" + x + ", " + y + ")";
	}
}
