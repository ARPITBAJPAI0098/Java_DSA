package coadingninja;

public class conditonal {
    public static void main(String[] args) {
        int x = 15;
        if (x <= 15) {
            System.out.print("Inside if  ");
        } else if (x == 15) {
            System.out.print("Inside else if  ");
        }
        System.out.println(x);
    }
}

// First if condition will be checked first, and it evaluates to true. Hence,
// the statement inside if will be executed, so it will print "Inside if ".
// After that, else if part will be skipped. Because in if-else statements, once
// a condition is satisfied remaining all the conditions are skipped without
// evaluation.
// After exit from if-else statement, the last print statement will be executed.
// Hence it will next print value of x i.e. 15.
// So the output is : "Inside if 15"
