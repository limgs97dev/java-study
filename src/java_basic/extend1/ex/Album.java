package java_basic.extend1.ex;

public class Album extends CommonFiled {
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    void print() {
        super.print();
        System.out.println(artist);
    }
}
