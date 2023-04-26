package net.billschofield.oop_examples.testing_loops;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;

public class ApplicationTest {

    @Test
    @Disabled
    public void shouldShouldContinueUntilUserQuits() {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Menu menu = mock(Menu.class);

        Application application = new Application(menu);

        application.start();
    }

}