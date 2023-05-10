package developer_learning_resources.object_oriented_design.object_oriented_principles.inheritence;

public class Lion extends Cat {
    public Lion() {
        super("Lion");
    }

    @Override
    public String speak() {
        return "Roar";
    }
}
