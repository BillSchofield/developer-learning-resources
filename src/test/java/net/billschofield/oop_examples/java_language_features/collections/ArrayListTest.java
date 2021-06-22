package net.billschofield.oop_examples.java_language_features.collections;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class ArrayListTest {

    private List<String> listOfStrings;

    @Before
    public void setUp() throws Exception {
        listOfStrings = new ArrayList<>();
    }

    @Test
    public void shouldBeACollection(){
        assertThat(listOfStrings, is(instanceOf(Collection.class)));
    }

    @Test
    public void shouldAddDuplicate(){
        listOfStrings.add("a");
        listOfStrings.add("a");

        assertThat(listOfStrings, hasSize(equalTo(2)));
    }

    @Test
    public void shouldBeInOrderAdded(){
        listOfStrings.add("b");
        listOfStrings.add("a");

        String[] inOrder = {"b", "a"};

        String[] actual = new String[2];
        listOfStrings.toArray(actual);

        assertThat(actual, is(inOrder));
    }

}