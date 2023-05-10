package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.animal;

public class Animal {
    private String name;
    private SpeakStrategy speakStrategy;
    private MoveStrategy moveStrategy;

    public Animal(String name, SpeakStrategy speakStrategy, MoveStrategy moveStrategy) {
        this.name = name;
        this.speakStrategy = speakStrategy;
        this.moveStrategy = moveStrategy;
    }

    public void act() {
        System.out.print("The " + name + " ");
        moveStrategy.move();
        System.out.print(" and then says ");
        speakStrategy.speak();
        System.out.println();
    }

}
