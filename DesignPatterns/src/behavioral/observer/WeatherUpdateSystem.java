package behavioral.observer;

public class WeatherUpdateSystem implements Observer {
    private String systemName;

    public WeatherUpdateSystem(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(systemName + " received update: Temperature is " + temperature);
    }
}
