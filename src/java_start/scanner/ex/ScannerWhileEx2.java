package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
      int price = scanner.nextInt();

      if (price == -1) {
        break;
      }

      System.out.print("상품의 수량을 입력하세요: ");
      int quantity = scanner.nextInt();

      System.out.println("총 비용: " + (price * quantity));
    }

  }

}
