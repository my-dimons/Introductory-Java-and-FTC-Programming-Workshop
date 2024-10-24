import java.util.Scanner;

class marioLess {
  public static void main(String[] args) {
    // Declare Scanner
    Scanner input = new Scanner(System.in);

    // Get height
    int height;

    do {
      System.out.print("Height: ");
      height = input.nextInt();
    } while ((height < 1) || (height > 8));

    // Print each row
    for (int row = 1; row <= height; row++) {
      // Print spaces on left side
      for (int numSpaces = height - row; numSpaces > 0; numSpaces--) {
        System.out.print(" ");
      }

      // Print hash on left side
      for (int numHash = 0; numHash < row; numHash++) {
        System.out.print("#");
      }

      // Middle gap
      System.out.print("  ");

      // Print hash on right side
      for (int numHash = 0; numHash < row; numHash++) {
        System.out.print("#");
      }

      System.out.println();
    }
  }
}
