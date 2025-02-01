package java_basic.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        System.out.println("bigData.count => " + bd.count);
        System.out.println("bigData.count => " + bd.data);

        // NPE
        System.out.println("bigData.data.value => " + bd.data.value);
    }
}
