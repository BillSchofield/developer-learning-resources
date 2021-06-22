package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.god_class;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Cat"));
        animals.add(new Animal("Fish"));

        for (Animal animal : animals) {
            animal.act();
        }
    }
}
