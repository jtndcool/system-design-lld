package Problems.BookMyShow.Repo;

import java.util.HashMap;

public class MoviePriceRepository {
    public static HashMap<Integer,Double> moviePrice = new HashMap<>();;
    static {
        moviePrice.put(1,4300.00);
        moviePrice.put(2,4020.00);
        moviePrice.put(3,4010.00);
        moviePrice.put(4,4200.00);
        moviePrice.put(5,4050.00);
        moviePrice.put(6,4070.00);
        moviePrice.put(7,4300.00);
        moviePrice.put(8,4020.00);
        moviePrice.put(9,4010.00);
        moviePrice.put(10,4800.00);
    }
    public static Double getPrice(Integer id){
        return moviePrice.get(id);
    }
}
