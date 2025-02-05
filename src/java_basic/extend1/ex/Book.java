package java_basic.extend1.ex;

public class Book extends CommonFiled {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    void print() {
        super.print();
        System.out.println(author);
        System.out.println(isbn);
    }
}
