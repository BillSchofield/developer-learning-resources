package net.billschofield.oop_examples.refactoring.parallel.game_math.before;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Character player = new Character("Player", 0.0, 1.0, 2.0);
        Character target = new Character("Target", 0.0,1.0, 4.0);

        System.out.println(player);
        System.out.println(target);

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
