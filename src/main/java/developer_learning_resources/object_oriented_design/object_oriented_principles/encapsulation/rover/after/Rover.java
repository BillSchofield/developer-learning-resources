package developer_learning_resources.object_oriented_design.object_oriented_principles.encapsulation.rover.after;

public class Rover {
    private int x;
    private int y;
    private String heading;

    public Rover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void moveForward() {
        switch(heading){
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
        }

    }

    public void reportPosition() {
        System.out.println(x + " " + y + " " + heading);
    }
}
