package net.billschofield.oop_examples.refactoring.parallel.game_math.after;

public class PlayerController {

	private final Character player;
	private final Character target;
	public PlayerController(Character player, Character target) {
		this.player = player;
		this.target = target;
	}

	public void update() {
		player.faceTarget(target);
		player.moveForward();
	}
}
