package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern;

import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies.SlinkStrategy;
import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies.SwimStrategy;
import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies.TrotStrategy;
import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies.BarkStrategy;
import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies.BlubStrategy;
import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies.MeowStrategy;
import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.Animal;

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
