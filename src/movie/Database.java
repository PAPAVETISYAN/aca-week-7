package movie;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Movie> movies = new ArrayList<>();
    public void setMovies(List<Movie> movies1){
        movies = movies1;
    }
    public void add(Movie movie){
        movies.add(movie);
    }
    public List<Movie> getMovies(){
        return movies;
    }
}
