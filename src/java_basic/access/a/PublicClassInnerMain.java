package java_basic.access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1(); // 같은 패키지라서 접근가능
        DefaultClass2 class2 = new DefaultClass2(); // 같은 패키지라서 접근가능
    }
}
