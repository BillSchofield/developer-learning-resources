package developer_learning_resources.testing_loops;

import developer_learning_resources.coding_practices.testing_loops.Application;
import developer_learning_resources.coding_practices.testing_loops.Menu;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;

public class ApplicationTest {

    @Test
    @Disabled
    public void shouldShouldContinueUntilUserQuits() {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Menu menu = Mockito.mock(Menu.class);

        Application application = new Application(menu);

        application.start();
    }

}