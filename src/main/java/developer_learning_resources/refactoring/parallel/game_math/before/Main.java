package developer_learning_resources.refactoring.parallel.game_math.before;

public class Main {
    public static void main(String[] args) {
        Character player = new Character("Player", 0.0, 1.0, 2.0);
        System.out.println(player);

        Character target = new Character("Target", 0.0,1.0, 4.0);
        System.out.println(target);

        PlayerController playerController = new PlayerController(player, target);
        playerController.update();

        System.out.println(player);
    }
}
