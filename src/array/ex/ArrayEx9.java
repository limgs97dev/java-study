package array.ex;

import java.util.Scanner;

public class ArrayEx9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] serviceList = {"상품 등록", "상품 목록", "종료"};
    int maxProductCount = 10;
    String[] productNames = new String[maxProductCount];
    int[] productPrices = new int[maxProductCount];
    int productCount = 0;

    while (true) {


      for (int i = 0; i < serviceList.length; i++) {
        System.out.print((i+1) + ". " + serviceList[i]);

        if (i < serviceList.length - 1) {
          System.out.print(" | ");
        } else {
          System.out.println();
        }
      }

      System.out.print("메뉴를 선택하세요: ");
      int inputMenu = scanner.nextInt();
      scanner.nextLine();

      if (inputMenu == 1) {
        if(productCount == maxProductCount) {
          System.out.println("더 이상 상품을 등록할 수 없습니다.");
          continue;
        }

        System.out.print("상품 이름을 입력하세요: ");
        productNames[productCount] = scanner.nextLine();

        System.out.print("상품 가격을 입력하세요: ");
        productPrices[productCount] = scanner.nextInt();

        productCount++;
      } else if (inputMenu == 2) {
        if (productCount == 0) {
          System.out.println("등록된 상품이 없습니다.");
          continue;
        }
        for (int i = 0; i < productCount; i++) {
          System.out.println(productNames[i] + ": " + productPrices[i]);
        }
      } else if (inputMenu == 3) {
        System.out.println("프로그램 종료");
        break;
      } else {
        System.out.println("잘못된 입력값입니다.");
      }
    }
  }
}
