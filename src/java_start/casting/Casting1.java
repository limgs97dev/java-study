package java_start.casting;

public class Casting1 {

  public static void main(String[] args) {

    int intValue = 10;
    long longValue;
    double doubleValue;

    longValue = intValue;
    System.out.println(longValue);

    doubleValue = intValue;
    System.out.println(doubleValue);

    doubleValue = 20L;
    System.out.println(doubleValue);
  }

}
