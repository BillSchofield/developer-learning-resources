package net.billschofield.oop_examples.testing_loops;

import java.io.BufferedReader;

public class Application {
    private Menu menu;

    public Application(Menu menu) {
        this.menu = menu;
    }

    public void start() {
        while(!menu.shouldQuit()){
            // Do a thing
            menu.chooseOption();
        }
    }
}
