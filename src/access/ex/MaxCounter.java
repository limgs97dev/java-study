package access.ex;

public class MaxCounter {
    private int max = 0;
    private int count;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (this.count >= this.max) {
            System.out.println("최대값을 초과할 수 없습니다!");
            return;
        }

        //실행 로직
        this.count++;

    }

    public int getCount() {
        return this.count;
    }
}
