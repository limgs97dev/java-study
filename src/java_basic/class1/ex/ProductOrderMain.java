package java_basic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder po1 = new ProductOrder();
        ProductOrder po2 = new ProductOrder();

        po1.productName = "제품1";
        po1.price = 10000;
        po1.quantity = 10;

        po2.productName = "제품1";
        po2.price = 5000;
        po2.quantity = 10;

        ProductOrder[] productOrders = { po1, po2 };

        int totalPrice = 0;

        for (ProductOrder productOrder : productOrders) {
            System.out.println(productOrder.productName + " " + productOrder.price + " " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }

        System.out.println(totalPrice);
    }
}
