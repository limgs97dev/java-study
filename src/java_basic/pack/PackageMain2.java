package java_basic.pack;

//import java_basic.pack.a.User;
//import java_basic.pack.b.User2;

import java_basic.pack.a.*;
//import java_basic.pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지 명 생략 가능
        User user2 = new User();
    }
}
