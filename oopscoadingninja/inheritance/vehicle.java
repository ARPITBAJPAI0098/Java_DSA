package oopscoadingninja.inheritance;

public class vehicle {
    String color;
    int maxs;

    public void setspeed(int maxspeed) {
        this.maxs = maxspeed;
    }

    public int getspeed() {
        return maxs;
    }

    public void print() {
        System.out.println("vehicle color is: " + color);
        System.out.println("vehicle speed is: " + maxs);
    }
}
