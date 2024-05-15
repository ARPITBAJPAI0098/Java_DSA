
import java.util.Scanner;

public class Comlex {
    // Complete this class
    public static class complex()
    {
        int real;
        int imag;

        complex(int r, int i) {
            this.real = r;
            this.imag = i;
        }
    }

    public static void addcomplex(complex s1,complex s2){
        int r=s1.real+s2.real;
        int i=s1.imag+s2.imag;
        System.out.println(r+"i"+i);
    }

    public static void multiplycomplex(complex s1,complex s2){
        int v=s1.real*s2.real;
        int u=s1.real*s2.imag;
        complex s3=new complex(v, u);
        int a=s1.imag*s2.real;
        int b=s1.imag*s2.imag;
        complex s4=new complex(a, b);
        addcomplex(s3, s4);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        complex s1=new complex(r1, r2);
            int r2=sc.nextInt();
            int i2=sc.nextInt();
        complex s1=new complex(r1, r2);
        int choice=sc.nextInt();
        if(choice==1){
            addcomplex(s1, s2);
        }
        else if(choice==2){
            multiplycomplex(s1, s2);
        }
        else{
            return -1;
        }

    }

}
