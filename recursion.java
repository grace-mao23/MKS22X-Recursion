import java.util.ArrayList;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n == 0) {
        return 0;
      }
      return sqrtH(n, 1.0, tolerance);
    }

    private static double sqrtH(double d, double guess, double tolerance) {
      if ((Math.abs(d - guess * guess)) / d * 100 <= tolerance) {
        return guess;
      }
      guess = (d / guess + guess) / 2;
      return sqrtH(d, guess, tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 0;
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
      ArrayList<Integer> result = new ArrayList<Integer>();
      return result;
    }

    public static void main(String[] args) {
      System.out.println(recursion.sqrt(100, 0.001));
      System.out.println(recursion.sqrt(1, 0.001));
      System.out.println(recursion.sqrt(0, 0.001));
      System.out.println(recursion.sqrt((99*99), 0.001));
    }

}
