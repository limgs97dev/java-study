package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] scoreArr = new int[4][3];
    String[] subjectArr = {"국어", "영어", "수학"};

    for (int i = 0; i < scoreArr.length; i++) {
      System.out.println(i+1 + "번 학생의 성적을 입력하세요 :");

      for (int j = 0; j < scoreArr[i].length; j++) {
        System.out.print(subjectArr[0] + " 점수: ");
        scoreArr[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < scoreArr.length; i++) {
      int sum = 0;

      for (int j = 0; j < scoreArr[i].length; j++) {
        sum += scoreArr[i][j];
      }

      double avg = sum / scoreArr[i].length;

      System.out.println(i + "번 학생의 총점: " + sum + ", 평균: " + avg);
    }


  }
}
