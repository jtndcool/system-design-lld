package Problems.BookMyShow.Service;

import Problems.BookMyShow.Models.Movie;
import Problems.BookMyShow.Service.Impl.SearchMovieByGenre;
import Problems.BookMyShow.Service.Impl.SearchMovieByLanguage;
import Problems.BookMyShow.Service.Impl.SearchMovieByName;

import java.util.List;

public class SearchContextService {
    private SearchMovie searchMovie;

    public void setSearchMethod(String searchMethod){
        if(searchMethod.equalsIgnoreCase("LANGUAGE")){
            this.searchMovie = new SearchMovieByLanguage();
        }
        else if(searchMethod.equalsIgnoreCase("GENRE")){
            this.searchMovie = new SearchMovieByGenre();
        } else if (searchMethod.equalsIgnoreCase("NAME")) {
            this.searchMovie = new SearchMovieByName();
        }
    }


    public List<Movie> searchMovies(String searchMethod, String keyword){
           setSearchMethod(searchMethod);
            if(searchMovie == null)
                throw new RuntimeException("Search criteria not selected");

            return searchMovie.searchMovies(keyword);
    }
}
