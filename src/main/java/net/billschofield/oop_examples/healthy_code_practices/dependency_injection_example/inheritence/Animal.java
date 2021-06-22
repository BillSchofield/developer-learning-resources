package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.inheritence;

import java.io.PrintStream;

public abstract class Animal {
    protected PrintStream printStream;

    public Animal(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void act(){
        printStream.print("The " + name() + " ");
        move();
        printStream.print(" and then says ");
        speak();
        printStream.println();
    }

    public abstract String name();
    public abstract void move();
    public abstract void speak();
}
