import java.util.Scanner;
/* 
class arrayexample{

    void multiarray()
    {
        int arr1[][]=new int[5][3];
        int arr2[][]={{1,2,3},{3,4,54}};
        System .out.println(arr2[1][2]);

    }


}

public class twoD {
    public static void main(String[] args) {
        arrayexample two=new arrayexample();// formation of an object of an class
        two.multiarray();
    }
}*/


// input the form of an two dimensional of the array 
public class twoD{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number you want to enter ");
        int n=sc.nextInt();
        // input of the first array
        int arr[]=new int [n];
        System.out.println("ente the inputs of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    // input of the second array
        int arr2[]=new int[n];
        System.out.println("enter the inputs of the second array");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }

        // printing of an array
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}