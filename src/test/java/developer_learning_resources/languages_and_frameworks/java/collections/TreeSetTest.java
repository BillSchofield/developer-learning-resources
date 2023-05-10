package developer_learning_resources.languages_and_frameworks.java.collections;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeSetTest {
    private Set<String> setOfStrings;

    @BeforeEach
    public void setUp() {
        setOfStrings = new TreeSet<>();
    }

    @Test
    public void shouldBeACollection(){
        assertThat(setOfStrings).isInstanceOf(Collection.class);
    }

    @Test
    public void shouldNotAddDuplicate(){
        setOfStrings.add("a");
        setOfStrings.add("a");

        assertThat(setOfStrings).hasSize(1);
    }

    @Test
    public void shouldBeInAlphabeticalOrder(){
        setOfStrings.add("b");
        setOfStrings.add("c");
        setOfStrings.add("a");

        String[] inOrder = {"a", "b", "c"};

        String[] actual = new String[3];
        setOfStrings.toArray(actual);

        assertThat(actual).isEqualTo(inOrder);
    }

}