package java_basic.extend1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        // 생성자는 하나만 호출할 수 있음. 현재 부모는 2개의 생성자가 있음
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
