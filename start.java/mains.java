import java.util.Scanner;
class algebra {
    public int sum (int a,int b)
    {
        int ans=a+b;
        return ans;
    }
}

public class mains
{
    public static void main(String[] args) {
        algebra add=new algebra();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the inputs");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the sum of the two number is");
        int k=add.sum(a,b);
        System.out.println(k);

    }
}