import java.util.Scanner;

class algebra{
  
    int add(int a,int b)
    {
        return  a+b;
        
    }
}
public class calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thee inputs");
        int a=sc.nextInt();
        int b=sc.nextInt();
        algebra sum=new algebra();

        int k=sum.add(a,b);
        System.out.println(k);
           
            
    }
        
}

// in the int form of declaring the funnction you can the retrun the value
//but youy cannot retrun in the void function
//java only has pass by vlaue not have pass by refernce
    



        





