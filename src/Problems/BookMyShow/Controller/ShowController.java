package Problems.BookMyShow.Controller;

import Problems.BookMyShow.Models.Movie;
import Problems.BookMyShow.Models.Person;
import Problems.BookMyShow.Models.Show;
import Problems.BookMyShow.Models.Status;
import Problems.BookMyShow.Repo.ShowsRepository;
import Problems.BookMyShow.Service.BookingService;
import Problems.BookMyShow.Service.SearchContextService;
import Problems.SplitWise.Models.User;

import java.math.BigInteger;
import java.util.List;

public class ShowController {
    BookingService bookingService;
    SearchContextService searchContextService;

    public ShowController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    public ShowController(SearchContextService searchContextService){
        this.searchContextService = searchContextService;
    }

    public Status createBooking(){
        Show show  = ShowsRepository.getShows().get(0);
        Person person = new Person(1,"Jatin", BigInteger.valueOf(883762952));
        return bookingService.createBooking(show, person);
    }

    public Status searchMovies(String searchCriteria, String keyword){
        List<Movie> movieList = searchContextService.searchMovies(searchCriteria,keyword);
        return new Status("SUCCESS", movieList.toString(), null);
    }
}
