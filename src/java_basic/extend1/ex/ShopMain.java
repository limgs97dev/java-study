package java_basic.extend1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 20000, "seo");
        Movie movie = new Movie("영화1", 30000, "감독1", "배우1");

        book.print();
        System.out.println();
        album.print();
        System.out.println();
        movie.print();
        System.out.println();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();

        System.out.println("합 => " + sum);
    }
}
