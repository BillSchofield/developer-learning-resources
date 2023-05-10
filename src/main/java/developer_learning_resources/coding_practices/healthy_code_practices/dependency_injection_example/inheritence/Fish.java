package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.inheritence;

import java.io.PrintStream;

public class Fish extends Animal {
    public Fish(PrintStream printStream) {
        super(printStream);
    }

    @Override
    public String name() {
        return "Fish";
    }

    @Override
    public void move() {
        System.out.print("swims");
    }

    @Override
    public void speak() {
        System.out.println("blub");
    }
}
