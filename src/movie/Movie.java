package movie;

public class Movie {
    static int  count;

    public String name;
    public String authorName;
    public int id;
    public int rating;

    public Movie() {
        count++;
    }
}