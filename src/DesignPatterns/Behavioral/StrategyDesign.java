package DesignPatterns.Behavioral;

public class StrategyDesign {
    public static void main(String[] args) {
        RouteContext context = new RouteContext();
        context.setRouteStrategy(new PedestrianRouteStrategy());
        context.selectRoute("library","park");

    }
}

// Strategy Interface
interface RouteStrategy {
    public void selectRoute(String start, String destination);
}

// Concrete Strategy for Pedestrian
 class PedestrianRouteStrategy implements RouteStrategy {
    @Override
     public void selectRoute(String start, String destination) {
        System.out.println("Selecting pedestrian route from " + start + " to " + destination);
        // Logic for selecting pedestrian route
    }
}

// Concrete Strategy for Car
 class CarRouteStrategy implements RouteStrategy {
    @Override
    public void selectRoute(String start, String destination) {
        System.out.println("Selecting car route from " + start + " to " + destination);
        // Logic for selecting car route
    }
}

// Concrete Strategy for Bike
 class BikeRouteStrategy implements RouteStrategy {
    @Override
    public void selectRoute(String start, String destination) {
        System.out.println("Selecting bike route from " + start + " to " + destination);
        // Logic for selecting bike route
    }
}

// Context Class
class RouteContext {
    private RouteStrategy routeStrategy;

    // Set the strategy at runtime
    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    // Method to execute the strategy
    public void selectRoute(String start, String destination) {
        if (routeStrategy != null) {
            routeStrategy.selectRoute(start, destination);
        } else {
            System.out.println("No route strategy set!");
        }
    }
}


