package net.billschofield.oop_examples.refactoring.parallel.game_math.after;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerControllerTest {
	@Test
	void shouldMoveThePlayerNorthWhenTargetIsNorthOfThePlayer() {
		Character player = new Character("Player", 0.0, new Vector2(1.0, 2.0));
		Character target = new Character("Target", 0.0, new Vector2(1.0, 4.0));
		PlayerController playerController = new PlayerController(player, target);

		playerController.update();

		assertThat(player.getPosition().getX()).isEqualTo(1.0);
		assertThat(player.getPosition().getY()).isGreaterThan(2.0);
	}

	@Test
	void shouldMoveThePlayerEastWhenTargetIsEastOfThePlayer() {
		Character player = new Character("Player", 0.0, new Vector2(1.0, 2.0));
		Character target = new Character("Target", 0.0, new Vector2(2.0, 2.0));
		PlayerController playerController = new PlayerController(player, target);

		playerController.update();

		assertThat(player.getPosition().getX()).isGreaterThan(1.0);
		assertThat(player.getPosition().getY()).isEqualTo(2.0);
	}
}