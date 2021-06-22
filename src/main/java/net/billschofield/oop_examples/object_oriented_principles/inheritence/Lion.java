package net.billschofield.oop_examples.object_oriented_principles.inheritence;

public class Lion extends Cat {
    public Lion() {
        super("Lion");
    }

    @Override
    public String speak() {
        return "Roar";
    }
}
