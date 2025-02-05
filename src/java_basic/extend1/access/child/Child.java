package java_basic.extend1.access.child;

import java_basic.extend1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지 접근 가능
//        defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지 접근 가능
//        defaultMethod(); // 같은 패키지에서만 접근 가능하나 여기서는 다른 패키지이기 떄문에 접근 불가능
//        privateMethod(); // 자기 자신만 접근 가능

        printParent();
    }
}
