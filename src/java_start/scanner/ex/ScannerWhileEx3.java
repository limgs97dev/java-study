package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    int sum = 0;
    int avg = 0;

    System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요.");

    for(int i = 1; ; i++) {
      int num = scanner.nextInt();

      if (num == -1) {
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (double)(sum / (i - 1)) );
      }

      sum += num;

    }

//    while (true) {
//      int num = java_start.scanner.nextInt();
//
//      if (num == -1) {
//        System.out.println("합 : " + sum);
//        System.out.println("평균 : " + avg);
//      }
//
//      sum =
//
//    }

  }

}
