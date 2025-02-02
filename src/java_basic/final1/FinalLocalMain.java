package java_basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 붙으면 값을 한번만 할당할 수 있음.

        // final 지역 변수
        final int data1;
        data1 = 10;
//        data1 = 20; //Variable 'data1' might already have been assigned to

        final int data2 = 10;
//        data2 = 20; //compile error

    }

    static void method(final int parameter) {
//        parameter = 20; //Cannot assign a value to final variable 'parameter'
    }
}
