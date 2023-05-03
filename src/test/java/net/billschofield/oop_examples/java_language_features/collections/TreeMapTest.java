package net.billschofield.oop_examples.java_language_features.collections;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeMapTest {

    private Map<String, String> stringToStringMap;

    @BeforeEach
    public void setUp() {
        stringToStringMap = new TreeMap<>();
    }

    @Test
    public void shouldOverwriteOldEntry(){
        stringToStringMap.put("1", "a");
        stringToStringMap.put("1", "b");

        assertThat(stringToStringMap.get("1")).isEqualTo("b");
    }

    @Test
    public void shouldNotPutKeysInOrderAdded(){
        stringToStringMap.put("aaa", "");
        stringToStringMap.put("b", "");
        stringToStringMap.put("c", "");
        stringToStringMap.put("a", "");


        String[] inOrderAdded = {"aaa", "b", "c", "a"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
        keySet.toArray(keys);

        assertThat(keys).isNotEqualTo(inOrderAdded);
    }

    @Test
    public void shouldPutKeysInAlphabeticalOrder(){
        stringToStringMap.put("cc", "");
        stringToStringMap.put("a", "");


        String[] inAlphabeticalOrder = {"a", "cc"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
        keySet.toArray(keys);

        assertThat(keys).isEqualTo(inAlphabeticalOrder);
    }
}