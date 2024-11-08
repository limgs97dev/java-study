package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("입력받을 숫자의 개수를 입력하세요: ");
    int inputCount = scanner.nextInt();

    int[] numArr = new int[inputCount];

    System.out.println(inputCount + "개의 정수를 입력하세요: ");
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = scanner.nextInt();
    }

    int sum = 0;
    double avg;

    for (int num : numArr) {
      sum += num;
    }

    avg = sum / numArr.length;

    System.out.println("합계 : " + sum);
    System.out.println("평균 : " + avg);
  }
}
