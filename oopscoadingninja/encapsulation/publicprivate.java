package oopscoadingninja.encapsulation;

// you can privatise the class variable so thst it could not be used the others in order to modify 
// parameter of the class
// simply write..... private--acess within the class
//default means within the package
//public use anywhere
// if we donot want to change the parameter at anyhow condition let it be
//by making function also then write private final int num;
public class publicprivate {
    // int roll_no;
    // String name;
    private int rollnumbers;
    public String name;
    // private string name;

    public void setrollnumber(int rn) {
        rollnumbers = rn;

    }
    // if somenthing is privvate then you can fetch the
    // value by using the function as function can ftch the
    // rollnumber and the function is public

    public int rollnumberss() {
        return rollnumbers;
    }
}
