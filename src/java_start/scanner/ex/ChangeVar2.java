package java_start.scanner.ex;

import java.util.Scanner;

public class ChangeVar2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("입력 1 :");
    int num1 = scanner.nextInt();

    System.out.println("입력 2 :");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
      int temp;

      temp = num2;
      num2 = num1;
      num1 = temp;
    }

    for(int i = num1; i <= num2; i++) {
      System.out.print(i);

      if(i != num2) {
        System.out.print(", ");
      }
    }

//    while (num2 != num1 - 1) {
//      System.out.println(num1);
//      num1++;
//    }

  }

}
