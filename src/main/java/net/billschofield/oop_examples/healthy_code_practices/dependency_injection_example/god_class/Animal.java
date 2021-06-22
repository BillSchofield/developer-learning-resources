package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.god_class;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void act() {
        System.out.print("The " + name + " ");
        switch(name){
            case "Dog":
                System.out.print("trots");
                break;
            case "Cat":
                System.out.print("slinks");
                break;
            case "Fish":
                System.out.print("swims");
                break;
        }
        System.out.print(" and then says ");
        switch(name){
            case "Dog":
                System.out.print("woof");
                break;
            case "Cat":
                System.out.print("meow");
                break;
            case "Fish":
                System.out.print("blub");
                break;
        }
        System.out.println();
    }
}
