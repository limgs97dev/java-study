package java_start.scanner;

import java.util.Scanner;

public class ScanerWhile3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum = 0;

    while (true) {
      System.out.println("정수를 입력하세요. 0을 입력하면 종료.");
      int num = sc.nextInt();

      if (num == 0) {
        System.out.println(sum);
        break;
      }

      sum += num;
    }
  }

}
