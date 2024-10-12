package Problems.BookMyShow.Models;

import Problems.BookMyShow.Enums.Genre;

import java.math.BigInteger;

public class Movie {
    Integer id;
    String movieName;
    Genre genre;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", genre=" + genre +
                '}';
    }

    public Movie(Integer id, String movieName, Genre genre) {
        this.id = id;
        this.movieName = movieName;
        this.genre = genre;
    }

    public Movie(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
