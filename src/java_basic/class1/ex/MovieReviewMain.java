package java_basic.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "어벤져스";
        mr1.review = "재밌어요.";

        MovieReview mr2 = new MovieReview();
        mr2.title = "아이언맨";
        mr2.review = "재미없어요";

        System.out.println(mr1.title + mr1.review);
        System.out.println(mr2.title + mr2.review);
    }
}
