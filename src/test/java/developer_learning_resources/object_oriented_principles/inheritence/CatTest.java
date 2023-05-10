package developer_learning_resources.object_oriented_principles.inheritence;

import developer_learning_resources.object_oriented_design.object_oriented_principles.inheritence.Cat;
import developer_learning_resources.object_oriented_design.object_oriented_principles.inheritence.HouseCat;
import developer_learning_resources.object_oriented_design.object_oriented_principles.inheritence.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CatTest {

    private Cat lion;
    private Cat houseCat;

    @BeforeEach
    public void setUp() throws Exception {
        lion = new Lion();
        houseCat = new HouseCat();
    }

    @Test
    public void lionAndHouseCatShouldMoveTheSameSinceTheyBothInheritMoveFromCat(){
        assertThat(lion.move()).isEqualTo(houseCat.move());
    }

    @Test
    public void lionAndHouseCatShouldSpeakDifferentlySinceTheyDoNotInheritSpeak(){
        assertThat(lion.speak()).isNotEqualTo(houseCat.speak());
    }

}