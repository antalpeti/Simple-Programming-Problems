package elementary;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Collection of elementary level problems.
 *
 * @author Peti
 *
 */
public class Problems {

  /**
   * Write a program that prints ‘Hello World’ to the screen.
   */
  public void problem01() {
    System.out.println("Hello World!");
  }

  /**
   * Write a program that asks the user for her name and greets her with her name.
   *
   * @param in the input stream
   * @param out the output stream
   */
  public void problem02(InputStream in, PrintStream out) {
    Scanner keyboard = new Scanner(in);
    out.println("What is your name?");
    String name = keyboard.nextLine();
    System.out.println("Welcome " + name);
    keyboard.close();
  }

  /**
   * Write a program that asks the user for her name and greets, if the users Alice or Bob.
   *
   * @param in the input stream
   * @param out the output stream
   */
  public void problem03(InputStream in, PrintStream out) {
    Scanner keyboard = new Scanner(in);
    out.println("What is your name?");
    String name = keyboard.nextLine();
    if (name.equals("Alice") || name.equals("Bob")) {
      System.out.println("Welcome " + name);
    } else {
      System.out.println("I don't know you.");
    }
    keyboard.close();
  }

  /**
   * Write a program that asks the user for a number n and prints the sum of the numbers 1 to n.
   *
   * @param in the input stream
   * @param out the output stream
   */
  public void problem04(InputStream in, PrintStream out) {
    Scanner keyboard = new Scanner(in);
    out.println("Give a number?");
    int number = keyboard.nextInt();
    long sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    System.out.println("The sum of from 1 to " + number + " is: " + sum);
    keyboard.close();
  }

  /**
   * Modify the previous program such that only multiples of three or five are considered in the
   * sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
   *
   * @param in the input stream
   * @param out the output stream
   */
  public void problem05(InputStream in, PrintStream out) {
    Scanner keyboard = new Scanner(in);
    out.println("Give a number?");
    int number = keyboard.nextInt();
    long sum = 0;
    for (int index = 1; index <= number; index++) {
      if (index % 3 == 0 || index % 5 == 0) {
        sum += index;
      }
    }
    System.out
        .println("The sum of numbers of dividable 3 or 5 from 1 to " + number + " is: " + sum);
    keyboard.close();
  }
}
