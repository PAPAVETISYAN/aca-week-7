package movie;


import java.util.List;

public class Service implements MovieService {
    int id;
    void create(MoveRequest MovieRequest){
        Movie movie = new Movie();
        movie.authorName = MovieRequest.authorName;
        movie.name = MovieRequest.name;
        movie.rating = MovieRequest.rating;
        movie.id = Movie.count;
        Database database = new Database();
        database.add(movie);
    }

    @Override
    public void readAll() {
        Database database = new Database();
        List<Movie> movieList = database.getMovies();
        for(int i = 0; i < movieList.size(); i++){
            System.out.println(movieList.get(i).name);
        }
    }

    @Override
    public void readId(int id) {
        Database database = new Database();
        List<Movie> movieList = database.getMovies();
        System.out.println(movieList.get(id).name);
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void delete(int id) {
        Database database = new Database();
        List<Movie> movieList = database.getMovies();
        movieList.remove(id);
    }
}