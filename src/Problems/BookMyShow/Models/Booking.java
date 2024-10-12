package Problems.BookMyShow.Models;

import Problems.BookMyShow.Enums.BookingStatus;

import java.util.Date;

public class Booking {
    Integer id;
    Double amount;
    Show show;
    Date bookingTime;
    BookingStatus bookingStatus;
    Seat seat;
    Person person;

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", amount=" + amount +
                ", show=" + show +
                ", bookingTime=" + bookingTime +
                ", bookingStatus=" + bookingStatus +
                ", seat=" + seat +
                ", person=" + person +
                '}';
    }

    public Booking(Integer id, Double amount, Show show, Date bookingTime, BookingStatus bookingStatus, Seat seat, Person person) {
        this.id = id;
        this.amount = amount;
        this.show = show;
        this.bookingTime = bookingTime;
        this.bookingStatus = bookingStatus;
        this.seat = seat;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
