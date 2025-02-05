package java_basic.extend1.ex;

public class CommonFiled {
    protected String name;
    protected int price;

    public CommonFiled(String name, int price) {
        this.name = name;
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void print() {
        System.out.println(name);
        System.out.println(price);
    }
}
