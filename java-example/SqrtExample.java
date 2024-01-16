/**
 * This Java program implements the Newton-Raphson method for finding square roots.
 * The main method takes a command-line argument `c` and calculates its square root.
 * 
 * The initial approximation of the square root is `c` itself. The program then repeatedly
 * improves the approximation using the formula `(c/t + t) / 2.0`, where `t` is the current
 * approximation.
 * 
 * The loop continues until the absolute difference between `t` and `c/t` is less than
 * `epsilon * t`, where `epsilon` is a small constant representing the desired relative error
 * tolerance (in this case, 1e-15).
 * 
 * Once the desired precision is achieved, the program prints out the final approximation of
 * the square root.
 * 
 * Here's an example of how the computation progresses for `sqrt(26.0)`:
 * 
 * Initial approximation: 26.0
 * Better approximation: 13.5
 * Better approximation: 7.38461538462
 * Better approximation: 5.48581560284
 * Better approximation: 5.09903373196
 * Final approximation: 5.09901951359
 * 
 * Note: The exact number of iterations required can vary depending on the initial approximation
 * and the number for which you're trying to find the square root.
 */

public class SqrtExample {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15; // relative error tolerance
        double t = c; // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon * t) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }
}
