package oopscoadingninja.inheritance;

class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        System.out.println(super.maxSpeed);
    }
}

class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
