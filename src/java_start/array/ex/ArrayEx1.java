package java_start.array.ex;

public class ArrayEx1 {

  public static void main(String[] args) {
    int[] numArr = {90, 80, 70, 60, 50};

    int total = 0;

    for (int num : numArr) {
      total += num;
    }

    double average = (double) total / 5;

    System.out.println("총합 " + total);
    System.out.println("평균 " + average);
  }
}
