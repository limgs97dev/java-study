package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
//        DecoUtil2 utils = new DecoUtil2();
        String deco = DecoUtil2.deco2(s);

        System.out.println("before => " + s);
        System.out.println("after => " + deco);
    }
}
