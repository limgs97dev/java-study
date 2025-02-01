package access.ex;

public class MaxCountMain {
    public static void main(String[] args) {
        MaxCounter c = new MaxCounter(3);

        c.increment();
        c.increment();
        c.increment();
        c.increment();

        int count = c.getCount();
        System.out.println(count);
    }
}
