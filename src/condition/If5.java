package condition;

public class If5 {

  public static void main(String[] args) {
    int price = 10000;
    int age = 10;
    int discount = 0;

    if (price >= 10000) {
      discount += 1000;
    }

    if (age <= 10) {
      discount += 1000;
    }

    System.out.println("discount = " + discount);
  }

}
