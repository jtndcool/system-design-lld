package Problems.BookMyShow.Service;

import Problems.BookMyShow.Models.Movie;

import java.util.List;

public interface SearchMovie {
    public List<Movie> searchMovies(String keyword);
}
