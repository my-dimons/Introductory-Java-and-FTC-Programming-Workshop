public class methods {
    public static void main(String[] args) {
        // Code to run goes here
        printHello(2, "Hello Ola");
        printHello(3, "Hello cat");
        printHello(5, "Hello dog");
        printHello(3);

        int value = sum(1,2);
    }

    public static void printHello(int numLoops, String toPrint) {
        for (int i = 0; i < numLoops; i++) {
            System.out.println(toPrint);
        }
    }

    public static void printHello(int numLoops) {
        for (int i = 0; i < numLoops; i++) {
            System.out.println("Hello");
        }
    }

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
