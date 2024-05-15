import java.util.Scanner;

 class structure {
    int age;
    String name;

}
public class strcuctoop{
    public static void main(String[] args) {
        structure student_1=new structure();
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        student_1.age=sc.nextInt();
        System.out.println(student_1.age);
    }
}
