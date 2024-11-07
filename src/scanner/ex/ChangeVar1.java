package scanner.ex;

public class ChangeVar1 {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp;

    // 시작
    temp = a;
    a = b;
    b = temp;

    // 종료
    System.out.println(a);
    System.out.println(b);
  }

}
