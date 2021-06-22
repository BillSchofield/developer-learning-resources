package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.polymorphism;

public class Fish implements Animal{

    @Override
    public void act() {
        System.out.println("The Fish swims and then says blub");
    }
}
