package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] nameArr = { "학생1", "학생2", "학생3" };
        int[] ageArr = { 15, 18, 21 };
        int[] gradeArr = { 90, 80, 50 };

        for(int i = 0; i < nameArr.length; i++) {
            System.out.println("이름 : " + nameArr[i] + " 나이: " + ageArr[i] + " 성적: " + gradeArr[i]);
        }
    }
}
