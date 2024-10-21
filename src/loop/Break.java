package loop;

public class Break {

  public static void main(String[] args) {
    // break => 반복문 중단
    // continue => 코드를 중단하고 다시 조건식으로 이동

    int sum = 0;
    int i = 1;

    while(true) {
      sum = sum + i;

      if (sum > 100000) {
        System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
        break;
      }

      i++;
    }
  }
}
