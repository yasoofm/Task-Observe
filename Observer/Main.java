package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(22, 13, 1003.11);
        WeatherDisplay display1 = new WeatherDisplay(1);
        WeatherDisplay display2 = new WeatherDisplay(2);
        WeatherDisplay display3 = new WeatherDisplay(3);
        WeatherDisplay display4 = new WeatherDisplay(4);

        station.registerObserver(display1);
        station.registerObserver(display2);
        station.registerObserver(display3);
        station.registerObserver(display4);

        station.notifyObservers();

        station.setTemperature(40);
        station.setHumidity(22);
        station.setPressure(1101.23);

        station.notifyObservers();

        station.setTemperature(1);
        station.setHumidity(1);
        station.setPressure(1.1);

        station.notifyObservers();

        station.setTemperature(5);
        station.setHumidity(5);
        station.setPressure(5.5);

        station.notifyObservers();

    }
}
