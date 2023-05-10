package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.inheritence;

import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.inheritence.Cat;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class AnimalTest {

    @Test
    public void shouldMoveWhenActing() {
        PrintStream printStream = mock(PrintStream.class);
        Cat cat = new Cat(printStream);
        cat.act();

        // Since we aren't returning anything from cat.act() what can we check/assert?
        // Hint: Dependency injection is the answer to software design questions 90% of the time.
    }
}