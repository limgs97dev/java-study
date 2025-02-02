package java_basic.ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder2 po1 = createOrder("상품1", 10_000, 10);
        ProductOrder2 po2 = createOrder("상품2", 20_000, 20);

        ProductOrder2[] pos = { po1, po2 };

        printOrders(pos);

//        int total = getTotalAmount(pos);
        int totalAmount = getTotalAmount(pos);
        System.out.println(totalAmount);
    }

    static ProductOrder2 createOrder(String productName, int price, int quantity) {
        ProductOrder2 po = new ProductOrder2();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        return po;
    }

    static void printOrders(ProductOrder2[] pos) {
        for (ProductOrder2 po : pos) {
            System.out.println(po.productName + " " + po.price + " " + po.quantity);
        }
    }

    static int getTotalAmount(ProductOrder2[] pos) {
        int totalAmount = 0;

        for (ProductOrder2 po : pos) {
            totalAmount += po.price * po.quantity;
        }

        return totalAmount;
    }
}
