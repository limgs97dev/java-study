package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 80);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 20, 90);

        MemberInit[] memberInits = { member1, member2 };

        for (MemberInit memberInit : memberInits) {
            System.out.println(memberInit.name + " " + memberInit.age + " " + memberInit.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
