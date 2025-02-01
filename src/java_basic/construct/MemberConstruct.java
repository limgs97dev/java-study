package java_basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        // this()를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있음.
        // 단, this()는 생성자 코드 첫줄에서만 작성할수있음.
        this(name, age, 50); // 자신의 생성자
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        System.out.println("name => " + name);
        System.out.println("age => " + age);
        System.out.println("grade => " + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
