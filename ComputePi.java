// This program computes the value of PI
import java.util.Random;

public class ComputePi {
  public static void main(String args[]) {
    int attempts = 1000;
    int hits = 0;
    Random rnd = new Random();

    for (int i = 0; i < attempts; i++) {
      double x = rnd.nextDouble();
      double y = rnd.nextDouble();

      if (x*x + y*y > 1)
        hits = hits + 1;
    }

    double pi = (double) hits / attempts;

    System.out.println("The value of pi is " + pi);
  }
}
