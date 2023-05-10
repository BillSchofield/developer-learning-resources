package developer_learning_resources.object_oriented_design.object_oriented_principles.encapsulation.rover.after;


public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover(1, 3, "N");
        rover.moveForward();
        rover.reportPosition();
    }
}
