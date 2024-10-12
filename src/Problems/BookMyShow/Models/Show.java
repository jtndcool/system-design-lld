package Problems.BookMyShow.Models;

import java.util.Date;
import java.util.List;

public class Show {
    Integer id;
    Date startTime;
    Date endTime;
    Movie movie;
    Integer auditoriumId;
    Integer cinemaId;
    List<Seat> seats;

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", movie=" + movie +
                ", auditoriumId=" + auditoriumId +
                ", cinemaId=" + cinemaId +
                '}';
    }

    public Show(Integer id, Date startTime, Date endTime, Movie movie, Integer auditoriumId, Integer cinemaId, List<Seat> seats) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movie = movie;
        this.auditoriumId = auditoriumId;
        this.cinemaId = cinemaId;
        this.seats = seats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Show(Integer id, Date startTime, Date endTime, Movie movie, Integer auditoriumId, Integer cinemaId) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movie = movie;
        auditoriumId = auditoriumId;
        this.cinemaId = cinemaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getAuditoriumId() {
        return auditoriumId;
    }

    public void setAuditoriumId(Integer auditoriumId) {
        this.auditoriumId = auditoriumId;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }
}
