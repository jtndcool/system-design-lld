package Problems.BookMyShow.Service;

import Problems.BookMyShow.Enums.BookingStatus;
import Problems.BookMyShow.Enums.SeatStatus;
import Problems.BookMyShow.Enums.SeatType;
import Problems.BookMyShow.Models.*;
import Problems.BookMyShow.Repo.MoviePriceRepository;
import Problems.BookMyShow.Repo.ShowsRepository;

import java.util.Date;

public class BookingService {

    MoviePriceRepository moviePriceRepository;
    ShowsRepository showsRepository;
    public Status createBooking(Show show, Person person){
        Seat seat = new Seat(1, SeatType.GOLD, SeatStatus.AVAILABLE);
        Booking booking = new Booking(1,moviePriceRepository.getPrice(show.getMovie().getId()),ShowsRepository.getShows().get(1),new Date(), BookingStatus.SUCCESS,seat,person);
        return new Status("SUCCESS","WOW CHACHA YOU MADE A BOOKING "+booking.toString(),null);
    }
}
