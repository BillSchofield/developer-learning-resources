package net.billschofield.oop_examples.object_oriented_principles.encapsulation.after;

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
