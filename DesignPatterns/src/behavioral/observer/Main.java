package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject weatherStation = new Subject();

        WeatherUpdateSystem system1 = new WeatherUpdateSystem("Weather App");
        WeatherUpdateSystem system2 = new WeatherUpdateSystem("Notification System");

        weatherStation.addObserver(system1);
        weatherStation.addObserver(system2);

        weatherStation.setTemperature(28.5f);
        weatherStation.setTemperature(30.0f);
    }
}
