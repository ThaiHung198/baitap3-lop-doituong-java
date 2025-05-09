import java.util.Scanner;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        on = false;
        speed = SLOW;
        radius = 5.0;
        color = "Blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.on){
            return "Fan{speed=" + speed + ", radius=" + radius + ", color=" + color + "- fan is on" + "}";
        } else {
            return "Fan{ radius=" + radius + ", color=" + color + "- fan is off" + "}";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow ");
        fan1.setOn(true);
        System.out.println("Fan 1  " + fan1.toString());

        Fan fan2 = new Fan();
        System.out.println("Fan 2: " + fan2.toString());
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

    }
}
