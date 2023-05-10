package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Fish());

        for (Animal animal : animals) {
            animal.act();
        }
    }
}
