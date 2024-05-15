package oopscoadingninja.exceptions;

public class ExceptionDemo {
  /*
   * public static void fun(int a, int b) throws Exception {
   * if (a + b == 2) {
   * Exception e = new Exception();
   * throw e;
   * }
   * }
   * 
   * public static void main(String[] args) throws Exception {
   * try {
   * fun(1, 1);
   * } catch (Exception e) {
   * System.out.println("invalid output");
   * 
   * } finally {
   * System.out.println("hey done");
   * }
   * 
   * }
   */
  /*
   * static void fun() throws Exception {
   * throw new Exception();
   * }
   * 
   * public static void main(String args[]) {
   * try {
   * fun();
   * } catch (Exception e) {
   * System.out.print("caught in main.");
   * }
   * System.out.print("All is well");
   * }
   * //new test
   * class A{
   * public static void main(String[] args){
   * 
   * try{
   * int a = 5/0;
   * }
   * catch(Exception e){
   * System.out.print("Exception caught ");
   * }
   * finally{
   * System.out.print("finally block");
   * }
   * }
   * }
   */

  public static void A() {
    System.out.print("Good ");
    throw new RuntimeException();
  }

  public static void B() {
    A();
    System.out.print("This ");
  }

  public static void main(String[] args) {
    try {
      B();
    } catch (Exception e) {
      System.out.print("Time ");
    } finally {
      System.out.print("at CodingNinjas");
    }
  }
}
