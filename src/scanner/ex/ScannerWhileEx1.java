package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("이름을 입력하세요: (종료를 입력하면 종료)");
      String name = scanner.nextLine();

      if (name.equals("종료")) {
        break;
      }

      System.out.println("나이를 입력하세요: ");
      int age = scanner.nextInt();

      System.out.println("입력한 이름: " + name);
      System.out.println("입력한 나이: " + age);
    }
  }
}
