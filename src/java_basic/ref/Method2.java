package java_basic.ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 16, 80);
        System.out.println("student1 => " + student1);
        Student student2 = createStudent("학생2", 17, 90);
        System.out.println("student1 => " + student1);

        toString(student1);
        toString(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();

        student.name = name;
        student.age = age;
        student.grade = grade;

        System.out.println("student => " + student);

        return student; // x001
    }

    static void toString(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
