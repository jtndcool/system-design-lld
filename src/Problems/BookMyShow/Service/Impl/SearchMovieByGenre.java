package Problems.BookMyShow.Service.Impl;

import Problems.BookMyShow.Enums.Genre;
import Problems.BookMyShow.Models.Movie;
import Problems.BookMyShow.Service.SearchMovie;

import java.util.Arrays;
import java.util.List;

public class SearchMovieByGenre implements SearchMovie {
    @Override
    public List<Movie> searchMovies(String keyword) {
        return Arrays.asList(
                new Movie(1, "The Conjuring", Genre.HORROR),
                new Movie(2, "The Mask", Genre.COMEDY),
                new Movie(3, "Se7en", Genre.CRIME),
                new Movie(4, "Hostel", Genre.GORE),
                new Movie(5, "Interstellar", Genre.CRIME),
                new Movie(6, "The Shining", Genre.HORROR)
        );
    }
}
