package java_basic.class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "어벤져스";
        mr1.review = "재밌어요.";

        MovieReview mr2 = new MovieReview();
        mr2.title = "아이언맨";
        mr2.review = "재미없어요..";

        MovieReview[] movieReviews = { mr1, mr2 };

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + movieReview.review);
        }
    }
}
