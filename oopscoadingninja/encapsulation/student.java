/*package oopscoadingninja.encapsulation;

// you can privatise the class variable so thst it could not be used the others in order to modify 
// parameter of the class
// simply write..... private--acess within the class
//default means within the package
//public use anywhere
// if we donot want to change the parameter at anyhow condition let it be
//by making function also then write private final int num;
*/
public class student {
    String name;
    private int rollnumber;
    static int numstudents;

    public void setrollnumber(int rn) {
        rollnumber = rn;

    }

    public int rollnumberss() {
        return rollnumber;
    }

    public student(String n, int rn) {
    name = n;
    rollnumber = rn;
    }
/*
 * public static class student(String name, int rollnumber) {
 * this.name = name;
 * this.rollnumber = rollnumber;
 * //numstudents++; // so whenever constructor made then automatically
 * // number of studnt get increased by1
 * }
 * // these are said to be the getter and setter
 * // you want the access data members which has the saem name as a local
 * variable
 * // of the class parameter
 * // then use this.parameter=parameter
 * //
 * 
 * // when you want only one data that should be shared by everybody then it is
 * // is said to be static
 * 
 * // static data member ko access krne kelie
 * // we fetch by classname.staticdataname
 * // for non static we can fetch by object name
 * // System.out.println(student.numstudents);
 * }
 */
