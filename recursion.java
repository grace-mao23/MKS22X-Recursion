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
      if ((Math.abs(d - guess * guess)) / d * 100 <= tolerance) { // percent error
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
      return fibH(n, 1, 1);
    }

    private static int fibH(int n, int first, int second) {
      if (n == 0) {
        return 0;
      }
      if (n < 3) {
        return second;
      }
      return fibH(n-1,second,first+second);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> result = new ArrayList<Integer>();
      sumsH(n, 0, result);
      return result;
    }

    private static void sumsH(int n, int currentSum, ArrayList<Integer> list) {
      if (n == 0) {
        list.add(currentSum);
      }
      sumsH(n-1, currentSum+n, list); // number n is added
      sumsH(n-1, currentSum, list); // number n is NOT added
    }

    public static void main(String[] args) {
      System.out.println(recursion.sqrt(100, 0.001));
      System.out.println(recursion.sqrt(1, 0.001));
      System.out.println(recursion.sqrt(0, 0.001));
      System.out.println(recursion.sqrt((99*99), 0.001));
      System.out.println(recursion.fib(0)); //0
      System.out.println(recursion.fib(1)); //1
      System.out.println(recursion.fib(2)); //1
      System.out.println(recursion.fib(5)); //5
      System.out.println(recursion.fib(7)); //13
      System.out.println(recursion.fib(10)); //55
    }

}
