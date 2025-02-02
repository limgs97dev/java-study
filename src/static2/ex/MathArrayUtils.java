package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성 제한하려고 접근제어자를 private 로 만듬
    }

    public static int sum(int[] values) {
        int sumValue = 0;

        for (int value : values) {
            sumValue += value;
        }

        return sumValue;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }

        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        return maxValue;
    }
}
