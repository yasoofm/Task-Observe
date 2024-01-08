package Observer;

public class WeatherDisplay implements Observer {
    private int id;
    private int updates;

    public WeatherDisplay(int id) {
        this.id = id;
        updates = 0;
    }

    public boolean update(int temp, int humi, double pres) {
        if (updates >= 2) {
            return false;
        } else {
            System.out.println(
                    "*******\nDisplay " + id + "\nTemperature: " + temp + "\nHumidity: " + humi + "\nPressure: "
                            + pres + "\n*******");
            updates++;
            return true;
        }
    }
}
