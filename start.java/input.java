
import java.util.Scanner;
public class input
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();// it will only reads the input without s[ce but if we want to take input of sentences 
        //then we use nextline()
        System.out.println("lucky number is "  + num);
        System.out.println("enter the  name");
        //String name=sc.next();
        // use of next is done instead nextInt() in case of the string
        String name=sc.nextLine();
        System.out.println("the string is" + name);
    }

}