package Problems.BookMyShow.Service.Impl;

import Problems.BookMyShow.Enums.Genre;
import Problems.BookMyShow.Models.Movie;
import Problems.BookMyShow.Service.SearchMovie;

import java.util.Arrays;
import java.util.List;

public class SearchMovieByLanguage implements SearchMovie {

    @Override
    public List<Movie> searchMovies(String keyword) {
        return Arrays.asList(
                new Movie(11, "The Conjuring", Genre.HORROR),
                new Movie(12, "The Mask", Genre.COMEDY),
                new Movie(13, "Se7en", Genre.CRIME),
                new Movie(14, "Hostel", Genre.GORE),
                new Movie(15, "Interstellar", Genre.CRIME),
                new Movie(16, "The Shining", Genre.HORROR)
        );
    }
}
