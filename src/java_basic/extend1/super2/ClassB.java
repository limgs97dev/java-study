package java_basic.extend1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super(); // 기본 생성자 (매개변수가 없는 생성자)는 생략 가능
//        this(a, 0); // 이 생성자 외 다른 생성자 호출
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
//        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
