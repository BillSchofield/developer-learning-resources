package net.billschofield.oop_examples.refactoring.parallel.game_math.after;

import static java.lang.Math.*;
import static net.billschofield.oop_examples.refactoring.parallel.game_math.after.Vector2.*;

public class Main {
    public static void main(String[] args) {

        Character player = new Character("Player", 0.0, new Vector2(1.0, 2.0));
        System.out.println(player);

        Character target = new Character("Target", 0.0, new Vector2(1.0, 4.0));
        System.out.println(target);

        player.faceTarget(target);
        System.out.println(player);

        player.moveForward();
        System.out.println(player);

    }
}
