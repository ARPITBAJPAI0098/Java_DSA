/* 
 * code 1
 * package encapsulation;
 * import java.util.Scanner;
 * public class Studentuset {
 * public static void main(String[] args) {
 * Scanner sc=new Scanner(System.in);
 * Studentt st=new Studentt();
 * st.name="arpit";
 * st.rollnumber=121;
 * 
 * }
 * }
 // code2
package Encapsulation;

public class Studentuset {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "arpit";
        s1.setrollnumber(1233);
        System.out.println(s1.getrollnumberss());
    }
}*/
// code3
package Encapsulation;

public class Studentuset {
    public static void main(String[] args) {
        Studentt s1 = new Studentt("a", 1);
        Studentt s2 = new Studentt("b", 2);
        Studentt s3 = new Studentt("c", 3);
        Studentt s4 = new Studentt("d", 4);
        // System.out.println(s1.numstudent);
        Studentt.setnumstudent = 10;
        System.out.println(Studentt.getnumstudent());
        // System.out.println(s1.name);
        // System.out.println(s4.numstudent);
        // here both s1 and s2 give same value of studentnum as studentnum is static so
        // its value get updated all time and get linked to all the object of the class
    }
}