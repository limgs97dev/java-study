package java_basic.static2.ex;

import static java_basic.static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum => " + sum(values));
        System.out.println("avg => " + average(values));
        System.out.println("sum => " + min(values));
        System.out.println("sum => " + max(values));
    }
}
