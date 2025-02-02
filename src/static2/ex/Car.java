package static2.ex;

public class Car {
    private String carName;
    public static int count;

    public Car(String carName) {
        this.carName = carName;
        this.count++;
        System.out.println("차량 구입, 이름: " + carName);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량의 수: " + Car.count);
    }
}
