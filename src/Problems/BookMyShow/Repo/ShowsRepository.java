package Problems.BookMyShow.Repo;

import Problems.BookMyShow.Enums.Genre;
import Problems.BookMyShow.Enums.SeatStatus;
import Problems.BookMyShow.Enums.SeatType;
import Problems.BookMyShow.Models.Movie;
import Problems.BookMyShow.Models.Seat;
import Problems.BookMyShow.Models.Show;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShowsRepository {

    public static List<Show> getShows(){
        List<Movie> movies = Arrays.asList(
                new Movie(1, "The Conjuring", Genre.HORROR),
                new Movie(2, "The Mask", Genre.COMEDY),
                new Movie(3, "Se7en", Genre.CRIME),
                new Movie(4, "Hostel", Genre.GORE),
                new Movie(5, "Interstellar", Genre.CRIME),
                new Movie(6, "The Shining", Genre.HORROR)
        );
        List<Show> shows = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            // Randomly select a movie from the list
            Movie movie = movies.get(new Random().nextInt(movies.size()));

            // Generate random auditorium, cinema ID, and time
            int auditoriumId = getRandomNumber(101, 110);
            int cinemaId = getRandomNumber(1, 5);
            Date startTime = getRandomDate();
            Date endTime = addDuration(startTime, 2, 30); // 2 hours 30 min duration

            // Generate seats for the show
            List<Seat> seats = generateSeats(100); // 100 seats

            // Create a new Show instance and add it to the list
            shows.add(new Show(i, startTime, endTime, movie, auditoriumId, cinemaId, seats));
        }
        return shows;
    }
    private static List<Seat> generateSeats(int count) {
        return IntStream.rangeClosed(1, count)
                .mapToObj(i -> new Seat(i, getRandomSeatType(), SeatStatus.AVAILABLE))
                .collect(Collectors.toList());
    }

    // Helper to get a random seat type
    private static SeatType getRandomSeatType() {
        SeatType[] seatTypes = SeatType.values();
        return seatTypes[new Random().nextInt(seatTypes.length)];
    }

    // Helper to generate a random start time (e.g., 10 AM to 10 PM)
    private static Date getRandomDate() {
        Calendar calendar = Calendar.getInstance();
        int hour = getRandomNumber(10, 22); // Random hour between 10 AM and 10 PM
        int minute = getRandomNumber(0, 59); // Random minute
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
    private static Date addDuration(Date startTime, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    // Helper to get a random number between min and max (inclusive)
    private static int getRandomNumber(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
