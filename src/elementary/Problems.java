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
}
