package developer_learning_resources.coding_practices.refactoring.parallel.game_math.exercise;

import static java.lang.Math.*;

public class PlayerController {
	private final Character player;
	private final Character target;

	public PlayerController(Character player, Character target) {
		this.player = player;
		this.target = target;
	}

	public void update() {
		double playerHeadingVectorX = cos(player.getHeading());
		double playerHeadingVectorY = sin(player.getHeading());
		double vectorToTargetX = target.getX() - player.getX();
		double vectorToTargetY = target.getY() - player.getY();
		double angleToTarget = acos(
				(playerHeadingVectorX * vectorToTargetX + playerHeadingVectorY * vectorToTargetY) /
						sqrt(pow(playerHeadingVectorX, 2) + pow(playerHeadingVectorY, 2)) *
						sqrt(pow(vectorToTargetX, 2) + pow(vectorToTargetY, 2))
		);

		player.setHeading(angleToTarget);

		player.setX(player.getX() + cos(player.getHeading()));
		player.setY(player.getY() + sin(player.getHeading()));
	}
}
