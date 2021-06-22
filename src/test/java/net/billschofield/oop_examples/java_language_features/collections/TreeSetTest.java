package net.billschofield.oop_examples.java_language_features.collections;


import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class TreeSetTest {
    private Set<String> setOfStrings;

    @Before
    public void setUp() {
        setOfStrings = new TreeSet<>();
    }

    @Test
    public void shouldBeACollection(){
        assertThat(setOfStrings, is(instanceOf(Collection.class)));
    }

    @Test
    public void shouldNotAddDuplicate(){
        setOfStrings.add("a");
        setOfStrings.add("a");

        assertThat(setOfStrings, hasSize(equalTo(1)));
    }

    @Test
    public void shouldBeInAlphabeticalOrder(){
        setOfStrings.add("b");
        setOfStrings.add("c");
        setOfStrings.add("a");

        String[] inOrder = {"a", "b", "c"};

        String[] actual = new String[3];
        setOfStrings.toArray(actual);

        assertThat(actual, is(inOrder));
    }

}