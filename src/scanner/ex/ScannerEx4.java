package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("수 입력 : ");
    int num = scanner.nextInt();

    for (int i = 1; i <= 9; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }
  }

}
