package loop.ex;

public class WhileEx3 {

  public static void main(String[] args) {
    int i = 1;
    int max = 100;
    int num = 0;

    while (i <= max) {
      num += i;
      i++;
    }
    System.out.println("i = " + i + " num = " + num);
  }

}
