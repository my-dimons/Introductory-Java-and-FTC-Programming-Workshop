public class BuildTeamPlease {
  public static void main(String[] args) {
    robotPlease(2);
  }

  static void robotPlease() {
    System.out.println("Can I please have the robot for programming?");
  }

  static void robotPlease(int numPrint) {
    for (int i = 0; i < numPrint; i++) {
      System.out.println("Can I please have the robot for programming?");
    }
  }
}