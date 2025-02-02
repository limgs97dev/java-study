package java_basic.oop.ex;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

    void showArea() {
        System.out.println("넓이: " + calculateArea());
    }

    void showPerimeter() {
        System.out.println("둘레 길이: " + calculatePerimeter());
    }

    void showIsSquare() {
        System.out.println("정사각형 여부: " + isSquare());
    }
}
