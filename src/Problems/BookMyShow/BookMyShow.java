package Problems.BookMyShow;

import Problems.BookMyShow.Controller.ShowController;
import Problems.BookMyShow.Models.Status;
import Problems.BookMyShow.Service.BookingService;
import Problems.BookMyShow.Service.SearchContextService;

public class BookMyShow {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();
        SearchContextService searchContextService = new SearchContextService();
        ShowController bookController = new ShowController(bookingService);
        ShowController searchController = new ShowController(searchContextService);
//        Status bookingStatus =  bookController.createBooking();
//        System.out.println(bookingStatus);

        Status searchStatus = searchController.searchMovies("LANGUAGE","TERMINATOR");
        System.out.println(searchStatus);

    }
}
