package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int productCount = scanner.nextInt();

        ProductOrder2[] pos = new ProductOrder2[productCount];

        for (int i = 0; i < productCount; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            scanner.nextLine();

            pos[i] = createOrder(productName, price, quantity);
        }

        System.out.println("총 가격 => " + getTotalAmount(pos));
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
