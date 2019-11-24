/*
 * Class for a simple computer based weather station that reports
 * temperature (in Celsius) and Humidity values. 
 * The station is attached to a pair of sensors that reports the temperature.
 *
 * This class is implements Runnable so that it can be embedded in a Thread
 * which runs the periodic sensing.
 */

public class WeatherStation implements Runnable {

    private final TempSensor tmpSensor; // Temperature sensor.
    private final HumiditySensor humSensor; // Humidity sensor.

    private final long T_PERIOD = 500; // periodo sensore temperatura
    private final long H_PERIOD = 750;  // periodo sensore umidità

    /*
     * When a WeatherStation object is created, it in turn creates the sensor
     * objects it will use.
     */
    public WeatherStation() {
        tmpSensor = new TempSensor();
        humSensor = new HumiditySensor();
    }

    /*
     * The "run" method called by the enclosing Thread object when started.
     * Repeatedly sleeps a second, acquires the current temperature from its
     * sensor, and reports this as a formatted output string.
     */
    public void run() {
        int tmpReading;     // actual sensor reading.
        int humReading;     // actual sensor reading.

        while(true) {
            try{
                Thread.sleep(T_PERIOD);
            } catch (Exception e) {}    // ignore exceptions

            tmpReading = tmpSensor.readTemperature();

            System.out.printf("tmpSensor reading is %d degrees C%n", tmpReading);

            try{
                Thread.sleep(H_PERIOD);
            } catch (Exception e) {}  // ignore exceptions

            humReading = humSensor.readHumidity();

            System.out.printf("humSensor reading is %d degrees C%n", humReading);
        }
    }
    /*
     * Initial main methods.
     */
    public static void main(String[] args) {
        int n_threads = 10;
        WeatherStation ws = new WeatherStation();

        for (int i=0; i < n_threads; i++) {
            Thread tmpThread = new Thread(ws);
            Thread humThread = new Thread(ws);
            tmpThread.start();
            humThread.start();
            System.out.println("Started Thread # " + i);
        }
    }
}
        
        