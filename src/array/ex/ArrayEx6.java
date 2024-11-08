package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("입력받을 숫자의 개수를 입력하세요: ");
    int inputCount = scanner.nextInt();

    int[] numArr = new int[inputCount];

    System.out.println(inputCount + "개의 정수를 입력하세요: ");
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = scanner.nextInt();
    }

    int minNum;
    int maxNum;

    minNum = numArr[0];
    maxNum = numArr[0];

    for (int i = 0; i < numArr.length; i++) {
      int targetNumber = numArr[i];

      if (targetNumber < minNum) {
        minNum = targetNumber;
      }

      if (targetNumber > maxNum) {
        maxNum = targetNumber;
      }
    }

    System.out.println(minNum);
    System.out.println(maxNum);
  }
}
