package developer_learning_resources.java_language_features.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class HashSetTest {

    private Set<String> setOfStrings;

    @BeforeEach
    public void setUp() throws Exception {
        setOfStrings = new HashSet<>();
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
    public void shouldNotBeInOrderAdded(){
        setOfStrings.add("a");
        setOfStrings.add("b");
        setOfStrings.add("c");

        String[] inOrder = {"a", "b", "c"};

        String[] actual = new String[2];
        setOfStrings.toArray(actual);

        assertThat(actual).isNotEqualTo(inOrder);
    }

}