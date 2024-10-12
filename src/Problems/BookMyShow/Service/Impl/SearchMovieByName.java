package Problems.BookMyShow.Service.Impl;

import Problems.BookMyShow.Enums.Genre;
import Problems.BookMyShow.Models.Movie;
import Problems.BookMyShow.Service.SearchMovie;

import java.util.Arrays;
import java.util.List;

public class SearchMovieByName implements SearchMovie {
    @Override
    public List<Movie> searchMovies(String keyword) {
        return Arrays.asList(
                new Movie(21, "The Conjuring", Genre.HORROR),
                new Movie(22, "The Mask", Genre.COMEDY),
                new Movie(23, "Se7en", Genre.CRIME),
                new Movie(24, "Hostel", Genre.GORE),
                new Movie(25, "Interstellar", Genre.CRIME),
                new Movie(26, "The Shining", Genre.HORROR)
        );
    }
}
