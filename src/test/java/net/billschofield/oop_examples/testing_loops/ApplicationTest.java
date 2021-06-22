package net.billschofield.oop_examples.testing_loops;

import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApplicationTest {

    @Test
    @Ignore
    public void shouldShouldContinueUntilUserQuits() {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Menu menu = mock(Menu.class);

        Application application = new Application(menu);

        application.start();
    }

}