package access.a;

// public 접근제어자를 사용하는 클래스는 자바파일당 1개만 기능
// default 접근제어자를 사용하는 클래스는 자바 파일안에 무제한으로 생성가능
public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출");
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출");
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출");
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
