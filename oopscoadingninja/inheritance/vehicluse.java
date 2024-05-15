package oopscoadingninja.inheritance;

public class vehicluse {
    public static void main(String[] args) {
        // vehicle v = new vehicle("red", 40);
        vehicle v = new vehicle();
        v.color = "black";
        v.setspeed(100);
        v.print();
        car c = new car();
        c.numgears = 36;
        c.print();

    }
}
