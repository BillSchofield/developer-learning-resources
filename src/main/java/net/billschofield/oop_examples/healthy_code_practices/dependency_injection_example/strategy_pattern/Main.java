package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern;

import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.Animal;
import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies.SlinkStrategy;
import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies.SwimStrategy;
import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies.TrotStrategy;
import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies.BarkStrategy;
import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies.BlubStrategy;
import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies.MeowStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", new BarkStrategy(), new TrotStrategy()));
        animals.add(new Animal("Cat", new MeowStrategy(), new SlinkStrategy()));
        animals.add(new Animal("Fish", new BlubStrategy(), new SwimStrategy()));

        for (Animal animal : animals) {
            animal.act();
        }
    }
}
