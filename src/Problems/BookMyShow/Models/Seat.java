package Problems.BookMyShow.Models;

import Problems.BookMyShow.Enums.SeatStatus;
import Problems.BookMyShow.Enums.SeatType;

public class Seat {
    Integer id;
    SeatType seatType;
    SeatStatus seatStatus;

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seatType=" + seatType +
                ", seatStatus=" + seatStatus +
                '}';
    }

    public Seat(Integer id, SeatType seatType, SeatStatus seatStatus) {
        this.id = id;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
