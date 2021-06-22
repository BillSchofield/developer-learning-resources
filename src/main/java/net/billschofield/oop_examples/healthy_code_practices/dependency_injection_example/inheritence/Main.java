package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.inheritence;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        PrintStream printStream = System.out;
        animals.add(new Dog(printStream));
        animals.add(new Cat(printStream));
        animals.add(new Fish(printStream));

        for (Animal animal : animals) {
            animal.act();
        }
    }
}
