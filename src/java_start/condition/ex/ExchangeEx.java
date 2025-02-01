package java_start.condition.ex;

public class ExchangeEx {

  public static void main(String[] args) {
    int dollar = 10;
    int exchangeLate = 1300;

    if(dollar < 0) {
      System.out.println("잘못된 금액입니다.");
    } else if (dollar == 0) {
      System.out.println("환전할 금액이 없습니다.");
    } else {
      int won = dollar * exchangeLate;
      System.out.println("환전 금액은 " + won + "원입니다.");
    }
  }

}
