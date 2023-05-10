package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.polymorphism;

public class Dog implements Animal {
    @Override
    public void act() {
        System.out.println("The Dog trots and then says woof");
    }
}
