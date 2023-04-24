package net.billschofield.oop_examples.refactoring.parallel.game_math.exercise;

public class Main {
    public static void main(String[] args) {

        Character player = new Character("Player", 0.0, 1.0, 2.0);
        Character target = new Character("Target", 0.0,1.0, 4.0);

        System.out.println(player);
        System.out.println(target);

        PlayerController playerController = new PlayerController(player, target);
        playerController.update();
    }
}