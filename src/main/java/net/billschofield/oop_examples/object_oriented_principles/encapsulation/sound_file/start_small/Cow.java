package net.billschofield.oop_examples.object_oriented_principles.encapsulation.sound_file.start_small;

public class Cow {
    public void speak() {
        SoundPlayer soundPlayer = new SoundPlayer();
        soundPlayer.play("./sounds/animals/cow/speak.mp3");
    }
}
