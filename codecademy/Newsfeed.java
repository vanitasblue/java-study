package codecademy;

public class Newsfeed {
    String[] trendingArticles;
    int[] views;
    double[] ratings;

    public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings) {
        trendingArticles = initialArticles;
        views = initialViews;
        ratings = initialRatings;
    }

    public String getTopArticle() {
        return trendingArticles[0];
    }

    public String getLatestArticle() {
        return trendingArticles[trendingArticles.length - 1];
    }

    public void viewArticles(int articleNumber) {
        views[articleNumber] = views[articleNumber] + 1;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
    }

    public void changeRating(int articleNumber, double newRating) {
        if (newRating > 5 || newRating < 0) {
            System.out.println("The rating must be between 0 and 5 stars!");
        } else {
            ratings[articleNumber] = newRating;
            System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
        }
    }

    public static void main(String[] args) {
        String[] articles = {"2022 breeze art fair", "shot art: kiaf plus", "shot art: kiaf seoul", "2022 art week review", "exhibition october 2022"};
        int[] views = {87, 32, 13, 11, 7};
        double[] ratings = {2.5, 3.2, 5.0, 1.7, 4.3};
        Newsfeed feed1 = new Newsfeed(articles, views, ratings);
        feed1.viewArticles(2);
        feed1.viewArticles(2);
        System.out.println(feed1.getTopArticle());
        System.out.println(feed1.getLatestArticle());
        feed1.changeRating(3,2.3);
    }
}
