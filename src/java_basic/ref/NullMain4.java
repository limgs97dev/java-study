package java_basic.ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        System.out.println("bigData.count => " + bd.count);
        System.out.println("bigData.count => " + bd.data);

        bd.data = new Data();
        // NPE 안뜸
        System.out.println("bigData.data.value => " + bd.data.value);
    }
}
