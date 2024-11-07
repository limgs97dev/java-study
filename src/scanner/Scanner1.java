package scanner;

import java.util.Scanner;

public class Scanner1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("문자열은 입력하세요 : ");
    String str = scanner.nextLine(); //입력을 String으로 가져옴
    System.out.println(str);
  }

}
