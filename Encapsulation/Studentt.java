
/*
 * package encapsulation;
 * 
 * //code1 simply made the inital class and fetching its parameter value in
 * studenttuse
 * public class Studentt {
 * 
 * String name;
 * int rollnumber;
 * 
 * 
 * }
 * 
 * .............................
 * CODE2 BELOW
 * 
 * package Encapsulation;
 * 
 * public class Studentt {
 * String name;
 * private int rollnumber;
 * static int numstudents;
 * 
 * public void setrollnumber(int rn) {// these are getter setter
 * rollnumber = rn;
 * 
 * }
 * 
 * public int getrollnumberss() {
 * return rollnumber;
 * }
 * // constructor
 * public Studentt(String n, int rn) {
 * name=n;rollnumber=rn;
 * // }
 * }
 */

// code3
package Encapsulation;

public class Studentt {
    String name;
    int rollnumber;
    public int setnumstudent;
    private static int numstudent; // as before private anybody can change it by using
    // s1.numstudent=10;as it is under constructor

    public void setnumstudent(int rn) {
        rollnumber = rn;

    }

    public int getnumstudent() {
        return numstudent;
    }

    public Studentt(String s, int r) {
        this.name = s;
        this.rollnumber = r;
        numstudent++;// no need to form the above initialisation just as above for the static
    }

}
// static are accessed by using the parentclassname.staticvariablename
