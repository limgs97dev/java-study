package construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 80;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 20;
        member2.grade = 70;

        MemberInit[] memberInits = { member1, member2 };

        for (MemberInit memberInit : memberInits) {
            System.out.println(memberInit.name + " " + memberInit.age + " " + memberInit.grade);
        }
    }
}
