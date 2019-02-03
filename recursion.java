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
      } else {
        sumsH(n-1, currentSum+n, list); // number n is added
        sumsH(n-1, currentSum, list); // number n is NOT added
      }
    }

    public static void main(String[] args) {
      System.out.println("------Sqrt Tests------");
      System.out.println(recursion.sqrt(0, 0.001) + " = " + Math.sqrt(0));
      System.out.println(recursion.sqrt(1, 0.001) + " = " + Math.sqrt(1));
      System.out.println(recursion.sqrt(2, 0.001) + " = " + Math.sqrt(2));
      System.out.println(recursion.sqrt(100, 0.001) + " = " + Math.sqrt(100));
      System.out.println(recursion.sqrt((99*99), 0.001) + " = " + Math.sqrt(99*99));
      System.out.println("------Fib Tests------");
      System.out.println("0th term: "+recursion.fib(0)); //0
      System.out.println("1st term: "+recursion.fib(1)); //1
      System.out.println("2nd term: "+recursion.fib(2)); //1
      System.out.println("3rd term: "+recursion.fib(3));
      System.out.println("4th term: "+recursion.fib(4));
      System.out.println("5th term: "+recursion.fib(5));
      System.out.println("6th term: "+recursion.fib(6));
      System.out.println("7th term: "+recursion.fib(7));
      System.out.println("8th term: "+recursion.fib(8));
      System.out.println("9th term: "+recursion.fib(9));
      System.out.println("10th term: "+recursion.fib(10));
      System.out.println("------makeAllSums Tests------");
      System.out.println(recursion.makeAllSums(0));
      System.out.println(recursion.makeAllSums(1));
      System.out.println(recursion.makeAllSums(2));
      System.out.println(recursion.makeAllSums(3));
    }

}
