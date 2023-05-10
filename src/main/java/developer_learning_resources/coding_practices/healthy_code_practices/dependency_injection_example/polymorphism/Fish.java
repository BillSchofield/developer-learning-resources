package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.polymorphism;

public class Fish implements Animal{

    @Override
    public void act() {
        System.out.println("The Fish swims and then says blub");
    }
}
