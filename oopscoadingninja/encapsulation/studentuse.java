/*
 * package oopscoadingninja.encapsulation;
 * 
 * import java.util.Scanner;
 * 
 * public class studentuse {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * // student s1 = new student();
 * student s1 = new student("arpit", 12112);
 * 
 * // s1.name = "rahul";
 * // s1.rollnumber = 121;
 * // not working but
 * // s1.setrollnumber(121);
 * 
 * // System.out.println(s1.name);
 * // System.out.println(s1.rollnumberss());
 * // see as the student info is in the same package thats why in thids
 * // program also student data get fetched
 * // if package is different or simply class then we have the import the
 * // class where student is contained
 * // student.numstudents = 10;
 * // there we can change the static data types
 * // in ordr to avboid it we should use private
 * System.out.println(s1.name);
 * // static data member ko access krne kelie
 * // we fetch by classname.staticdataname
 * // for non static we can fetch by object name
 * // System.out.println(s1.numstudents);
 * }
 * }
 * 
 * 
 * eg;
 * What will be the output of the following code?
 * class Car{
 * static int year;
 * String company_name;
 * }
 * class new_Car {
 * public static void main (String[] args) {
 * Car c=new Car();
 * Car.year=2018;
 * c.company_name="KIA";
 * Car d=new Car();
 * System.out.print(d.year);
 * }
 * }
 * }
 * }
 * // imp
 * class Test
 * {
 * int a;
 * int b;
 * Test()
 * {
 * this(10, 20);
 * System.out.print("constructor one ");
 * }
 * Test(int a, int b)
 * {
 * this.a = a;
 * this.b = b;
 * System.out.print("constructor two ");
 * }
 * }
 * class new_test{
 * public static void main(String[] args)
 * {
 * Test object = new Test();
 * }
 * }
 * 
 * output: constructor two constructoro one
 */