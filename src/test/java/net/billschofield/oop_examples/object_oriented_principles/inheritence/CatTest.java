package net.billschofield.oop_examples.object_oriented_principles.inheritence;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class CatTest {

    private Cat lion;
    private Cat houseCat;

    @Before
    public void setUp() throws Exception {
        lion = new Lion();
        houseCat = new HouseCat();
    }

    @Test
    public void lionAndHouseCatShouldMoveTheSameSinceTheyBothInheritMoveFromCat(){
        assertThat(lion.move(), is(houseCat.move()));
    }

    @Test
    public void lionAndHouseCatShouldSpeakDifferentlySinceTheyDoNotInheritSpeak(){
        assertThat(lion.speak(), is(not(houseCat.speak())));
    }

}