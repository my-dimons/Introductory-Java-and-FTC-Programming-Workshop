import java.util.Scanner;

public class HelloSomeone {
  public static void main(String[] args) {
    // Declare Scanner
    Scanner input = new Scanner(System.in);

    // Get Name
    System.out.print("What is your name: ");
    String name = input.nextLine();

    // Get age
    System.out.print("What is your age: ");
    int age = input.nextInt();

    // Display the information
    System.out.println("Hello " + name + ", you are " + age + " years old.");
  }
}