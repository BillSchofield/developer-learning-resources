package developer_learning_resources.coding_practices.testing_loops;

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
