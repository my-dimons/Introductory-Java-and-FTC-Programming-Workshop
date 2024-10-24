import java.util.Scanner;

public class MarioLessTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height;

        do {
            System.out.print("Height: ");
            height = input.nextInt();
        } while (height<0);

        // Print each row
        for (int row = 1; row <= height; row++) {
            // Print spaces
            for (int numSpaces = height - row; numSpaces > 0; numSpaces--) {
                System.out.print(" ");
            }

            for (int numHash = 0; numHash < row; numHash++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}