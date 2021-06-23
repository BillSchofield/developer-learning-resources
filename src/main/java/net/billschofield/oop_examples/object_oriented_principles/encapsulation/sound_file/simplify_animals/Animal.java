package net.billschofield.oop_examples.object_oriented_principles.encapsulation.sound_file.simplify_animals;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        SoundPlayer soundPlayer = new SoundPlayer();
        soundPlayer.play("./sounds/animals/" + name + "/speak.mp3");
    }
}
