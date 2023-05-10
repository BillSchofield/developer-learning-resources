package developer_learning_resources.languages_and_frameworks.java.collections;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {

    private List<String> listOfStrings;

    @BeforeEach
    public void setUp() {
        listOfStrings = new ArrayList<>();
    }

    @Test
    public void shouldBeACollection(){
        assertThat(listOfStrings).isInstanceOf(Collection.class);
    }

    @Test
    public void shouldAddDuplicate(){
        listOfStrings.add("a");
        listOfStrings.add("a");

        assertThat(listOfStrings).hasSize(2);
    }

    @Test
    public void shouldBeInOrderAdded(){
        listOfStrings.add("b");
        listOfStrings.add("a");

        String[] inOrder = {"b", "a"};

        String[] actual = new String[2];
        listOfStrings.toArray(actual);

        assertThat(actual).isEqualTo(inOrder);
    }
}