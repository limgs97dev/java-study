package java_basic.extend1.ex;

public class Movie extends CommonFiled {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    void print() {
        super.print();
        System.out.println(director);
        System.out.println(actor);
    }
}
