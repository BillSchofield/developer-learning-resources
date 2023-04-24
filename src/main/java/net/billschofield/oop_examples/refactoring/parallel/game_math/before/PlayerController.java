package net.billschofield.oop_examples.refactoring.parallel.game_math.before;

import static java.lang.Math.*;
import static java.lang.Math.sin;

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
		System.out.println(player);

		player.setX(player.getX() + cos(player.getHeading()));
		player.setY(player.getY() + sin(player.getHeading()));
		System.out.println(player);
	}
}
