package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("음식 이름을 입력해주세요 : ");
    String foodName = scanner.nextLine();
    
    System.out.println("음식 가격을 입력해주세요 : ");
    int foodPrice = scanner.nextInt();
    
    System.out.println("음식 수량을 입력해주세요 : ");
    int foodAmount = scanner.nextInt();

    System.out.println(foodName + " " + foodAmount + "개를 주문하셨습니다. 총 가격은 " + (foodPrice * foodAmount) + "원입니다.");
  }

}
