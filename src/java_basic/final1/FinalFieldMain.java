package java_basic.final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit c1 = new ConstructInit(10);
        ConstructInit c2 = new ConstructInit(20);
        System.out.println(c1.value);
        System.out.println(c2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit f1 = new FieldInit();
        FieldInit f2 = new FieldInit();
        FieldInit f3 = new FieldInit();

//        f1.value = 20; // 초기값 있어서 못바꿈

        System.out.println(f1.value);
        System.out.println(f2.value);
        System.out.println(f3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        int maxUsers = Constant.MAX_USERS;
        System.out.println(maxUsers);
    }
}
