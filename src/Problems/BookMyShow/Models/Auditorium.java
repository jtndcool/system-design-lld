package Problems.BookMyShow.Models;

import java.util.List;

public class Auditorium {
    Integer id;
    String name;
    Integer cinemaId;
    List<Show> shows;

    public Auditorium(Integer id, String name, Integer cinemaId, List<Show> shows) {
        this.id = id;
        this.name = name;
        this.cinemaId = cinemaId;
        this.shows = shows;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
