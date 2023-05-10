package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.polymorphism;

public class Cat implements Animal{
    @Override
    public void act() {
        System.out.println("The Cat slinks and then says meow");
    }
}
