package developer_learning_resources.coding_practices.refactoring.parallel.game_math.exercise;

import developer_learning_resources.coding_practices.refactoring.parallel.game_math.exercise.Character;
import developer_learning_resources.coding_practices.refactoring.parallel.game_math.exercise.PlayerController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerControllerTest {
	@Test
	void shouldMoveThePlayerNorthWhenTargetIsNorthOfThePlayer() {
		Character player = new Character("Player", 0.0, 1.0, 2.0);
		Character target = new Character("Target", 0.0,1.0, 4.0);
		PlayerController playerController = new PlayerController(player, target);

		playerController.update();

		assertThat(player.getX()).isEqualTo(1.0);
		assertThat(player.getY()).isGreaterThan(2.0);
	}

	@Test
	void shouldMoveThePlayerEastWhenTargetIsEastOfThePlayer() {
		Character player = new Character("Player", 0.0, 1.0, 2.0);
		Character target = new Character("Target", 0.0,2.0, 2.0);
		PlayerController playerController = new PlayerController(player, target);

		playerController.update();

		assertThat(player.getX()).isGreaterThan(1.0);
		assertThat(player.getY()).isEqualTo(2.0);
	}


}