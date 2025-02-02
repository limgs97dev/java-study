package java_basic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("B count => " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count => " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("B count => " + Data3.count);


        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        // 정적변수는 클래스틀 통해서 접근해야함.
        // 코드를 읽을 때 마치 인스턴스변수에 접근하는 것 처럼 오해할 수 있기 때문.
        System.out.println(Data3.count);
    }
}
