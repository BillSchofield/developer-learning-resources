package net.billschofield.oop_examples.java_language_features.collections;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class HashMapTest {

    private Map<String, String> stringToStringMap;

    public static void main(String[] args) throws IOException {

        Map<String, Integer> nameToAge = new TreeMap<>();

        nameToAge.put("Tiffany", 27);
        nameToAge.put("Sebastian", 23);
        nameToAge.put("Bill", 48);
        nameToAge.put("Biff", 48);
        nameToAge.put("Henry", 23);

//        System.out.println("Enter a name:");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        System.out.println(name + "'s age is " + nameToAge.get(name));

        for (String name : nameToAge.keySet()) {
            System.out.println(name + " is " + nameToAge.get(name) + " years old");
        }


    }

    @BeforeEach
    public void setUp() {
        stringToStringMap = new HashMap<>();
    }

    @Test
    public void shouldOverwriteOldEntry(){
        stringToStringMap.put("1", "a");
        stringToStringMap.put("1", "b");

        assertThat(stringToStringMap.get("1")).isEqualTo("b");
    }

    @Test
    public void shouldNotPutKeysInOrderAdded(){
        stringToStringMap.put("c", "");
        stringToStringMap.put("e", "");
        stringToStringMap.put("b", "");
        stringToStringMap.put("d", "");
        stringToStringMap.put("a", "");

        String[] inOrderAdded = {"c", "e", "b", "d", "a"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[3];
        keySet.toArray(keys);

        assertThat(keys).isNotEqualTo(inOrderAdded);
    }

    @Test
    public void shouldNotPutKeysInAlphabeticalOrder(){
        stringToStringMap.put("c", "");
        stringToStringMap.put("e", "");
        stringToStringMap.put("b", "");
        stringToStringMap.put("d", "");
        stringToStringMap.put("a", "");

        String[] inAlphabeticalOrder = {"a", "b", "c", "d", "e"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
        keySet.toArray(keys);

        assertThat(keys).isNotEqualTo(inAlphabeticalOrder);
    }

}