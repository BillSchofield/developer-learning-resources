package net.billschofield.oop_examples.object_oriented_principles.inheritence;

public abstract class Cat {

    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String move(){
        return "Slinks";
    }

    public abstract String speak();
}
