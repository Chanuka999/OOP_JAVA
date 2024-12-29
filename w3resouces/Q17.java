import java.util.ArrayList;

class Movie{
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    Movie(String title,String director,ArrayList<String> actors){
        this.title=title;
        this.director=director;
        this.actors=actors;
        this.reviews = new ArrayList<Review>();
    }
    void addReview(Review review){
        this.reviews.add(review);
    }

    ArrayList<Review> getReviews(){
        return this.reviews;
    }

    String getTitle(){
        return title;
    }

    String getDirector(){
        return director;
    }
    ArrayList<String> getActors(){
        return this.actors;
    }
}