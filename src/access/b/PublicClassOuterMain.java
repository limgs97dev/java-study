package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //'access. a. DefaultClass1' is not public in 'access. a'. Cannot be accessed from outside package
//        DefaultClass1 class1 = new DefaultClass1(); // default 접근제어자는 같은 패키지에서만 접근 가능
//        DefaultClass2 class2 = new DefaultClass2(); // defulat 접근제어자는 같은 패키지에서만 접근 가능
    }
}
