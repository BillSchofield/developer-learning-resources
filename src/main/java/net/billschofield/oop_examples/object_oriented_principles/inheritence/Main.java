package net.billschofield.oop_examples.object_oriented_principles.inheritence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat houseCat = new HouseCat();
        Cat lion = new Lion();

        List<Cat> cats = new ArrayList<>();
        cats.add(houseCat);
        cats.add(lion);

        for (Cat cat : cats) {
            moveAndSpeak(cat);
        }

        System.out.println();
        System.out.println("Both house cats and tigers slink because they inherit their movement from Cat");
        System.out.println("This means that ALL cats slink.");
    }


    // This method is smelly how can we change it to improve encapsulation
    private static void moveAndSpeak(Cat cat) {
        System.out.println("The " + cat.name() + " " + cat.move() + " and then says " + cat.speak());
    }
}
