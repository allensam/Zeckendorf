import java.util.ArrayList;

/**
 * Created by samallen on 5/9/16.
 */
public class Fib {

  private static final int[] fibs = {13, 8, 5, 3, 2, 1};

  public static void main(String[] args) {
    for (int i = 0; i <= 20; i++) {
      if (i == 0) {
        System.out.print("0");

      } else {
        System.out.println(gen(i));
      }
    }
  }

  public static String gen(int num) {
    ArrayList<Integer> zeros = new ArrayList<>();
    int sum = 0;
    for (int fib : fibs) {
      if (sum + fib >= num) {
        zeros.add(0);
      } else {
        zeros.add(1);
        sum = sum + fib;
      }
    }

    return makeStr(zeros);
  }

  public static String makeStr(ArrayList<Integer> zeros) {
    String thing = "";
    boolean firstOne = false;
    for (int bin: zeros) {
      if (bin != 0) {
        thing = thing + bin;
        firstOne = true;
      } else {
        if (firstOne) {
          thing = thing + bin;
        }
      }
    }
    return thing;
  }
}
