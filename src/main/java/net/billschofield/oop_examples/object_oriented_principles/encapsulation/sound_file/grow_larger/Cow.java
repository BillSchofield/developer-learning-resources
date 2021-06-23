package net.billschofield.oop_examples.object_oriented_principles.encapsulation.sound_file.grow_larger;

public class Cow implements Animal {
    @Override
    public void speak() {
        SoundPlayer soundPlayer = new SoundPlayer();
        soundPlayer.play("./sounds/animals/cow/speak.mp3");
    }
}
