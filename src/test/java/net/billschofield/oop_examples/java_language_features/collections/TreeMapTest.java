package net.billschofield.oop_examples.java_language_features.collections;


import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TreeMapTest {

    private Map<String, String> stringToStringMap;

    @Before
    public void setUp() {
        stringToStringMap = new TreeMap<>();
    }

    @Test
    public void shouldOverwriteOldEntry(){
        stringToStringMap.put("1", "a");
        stringToStringMap.put("1", "b");

        assertThat(stringToStringMap.get("1"), is("b"));
    }

    @Test
    public void shouldNotPutKeysInOrderAdded(){
        stringToStringMap.put("aaa", "");
        stringToStringMap.put("b", "");


        String[] inOrderAdded = {"aa", "b"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
        keySet.toArray(keys);

        assertThat(keys, is(not(inOrderAdded)));
    }

    @Test
    public void shouldPutKeysInAlphabeticalOrder(){
        stringToStringMap.put("cc", "");
        stringToStringMap.put("a", "");


        String[] inAlphabeticalOrder = {"a", "cc"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
        keySet.toArray(keys);

        assertThat(keys, is(inAlphabeticalOrder));
    }

}