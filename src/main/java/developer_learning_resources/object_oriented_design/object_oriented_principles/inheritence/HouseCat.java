package developer_learning_resources.object_oriented_design.object_oriented_principles.inheritence;

public class HouseCat extends Cat {
    public HouseCat() {
        super("House Cat");
    }

    @Override
    public String speak() {
        return "Meow";
    }

}
