package Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class WeatherStation implements Subject {
    private int temperature, humidity;
    private double pressure;
    private ArrayList<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<Observer>();
    }

    public WeatherStation(int temperature, int humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        observers = new ArrayList<Observer>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        Iterator<Observer> itr = observers.iterator();
        if (observers.size() > 0) {
            while (itr.hasNext()) {
                if (!itr.next().update(temperature, humidity, pressure)) {
                    itr.remove();
                }
            }
        } else {
            System.out.println("There are no observers.");
        }
    }
}
