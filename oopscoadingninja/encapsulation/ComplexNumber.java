package oopscoadingninja.encapsulation;

public class ComplexNumber {
    private int rp;
    private int ip;

    public ComplexNumber(int rp, int ip) {
        this.rp = rp;
        this.ip = ip;
    }

    public void print() {
        if (ip == 0) {
            System.out.println(rp + " ");
        } else if (rp == 0) {
            System.out.println("i" + ip);
        } else {
            System.out.println(ip + "+" + "i" + ip);
        }
    }
}
