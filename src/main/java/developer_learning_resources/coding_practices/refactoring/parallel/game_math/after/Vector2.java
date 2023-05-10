package developer_learning_resources.coding_practices.refactoring.parallel.game_math.after;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Vector2 {
	private final double x;
	private final double y;

	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static Vector2 add(Vector2 vector1, Vector2 vector2) {
		return new Vector2(vector1.x + vector2.x, vector1.y + vector2.y);
	}

	public static Vector2 subtract(Vector2 vector1, Vector2 vector2) {
		return new Vector2(vector2.x - vector1.x, vector2.y - vector1.y);
	}

	public static Vector2 directionVectorFromHeading(double heading) {
		return new Vector2(cos(heading), sin(heading));
	}

	public static double angleBetweenVectors(Vector2 vector1, Vector2 vector2) {
		return acos(
				dotProduct(vector1, vector2) /
						vector1.magnitude() *
						vector2.magnitude()
		);
	}

	public static double dotProduct(Vector2 vector1, Vector2 vector2) {
		return vector1.x * vector2.x + vector1.y * vector2.y;
	}

	public double magnitude() {
		return sqrt(pow(x, 2) + pow(y, 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
