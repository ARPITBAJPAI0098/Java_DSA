package oopscoadingninja.inheritance;

public class car extends vehicle {
    int numgears;
    boolean iscovertible;

    public void print()

    {
        super.print();
        System.out.println(color);
        System.out.println(getspeed());
        System.out.println(iscovertible);
        System.out.println(numgears);
    }

}
