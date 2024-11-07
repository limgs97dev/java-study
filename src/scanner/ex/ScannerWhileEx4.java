package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    while (true) {
      System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
      int option = scanner.nextInt();


      if(option == 1) {
        scanner.nextLine();

        System.out.println("상품 : ");
        String productName = scanner.nextLine();

        System.out.println("가격 : ");
        int price = scanner.nextInt();

        System.out.println("수량 : ");
        int quantity = scanner.nextInt();

        sum += price * quantity;

        System.out.println("상품명 : " + productName);
        System.out.println("가격 : " + price);
        System.out.println("수량 : " + quantity);
        System.out.println("합계 : " + price * quantity);
      } else if (option == 2) {
        System.out.println("총합 : " + sum);

      } else if (option == 3) {
        System.out.println("프로그램 종료");
        break;
      } else {
        System.out.println("올바른 옵션 선택해주세요.");
      }
    }
  }

}
