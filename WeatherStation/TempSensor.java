//import java.util.Random;   // to simulate random temperature fluctuations.

public class TempSensor {
    /*
     * Min and max readings this sensor will actually report:
     *    23315 = -40 C
     *    32315 =  50 C
     * and the default (initial reading)
     *    29315 =  20 C
     */
    // private final int MINREADING = 23315;
    // private final int MAXREADING = 32315;
    private final int DEFAULT = Integer.MIN_VALUE;
    private int currReading;         // current sensor reading

    // private boolean increasing = true;  // TRUE if temperature tending up
    // private Random rand = new Random(); // simulate random temp, changes.

    /*
     * Initialize the sensor to the DEFAULT value.
     */
    public TempSensor() {
        this.currReading = DEFAULT;
    }

    public static int readTemperature() {
        return (int)Math.ceil(200 * Math.random()) - 100;
    }
}



    /*
     * Give a new reading based on the last reading and whether the
     * temperature is trending up or down. We assume that the temperature
     * has a 80% chance of continuing on its current trend and 20%
     * chance of changing direction. Also, we will not allow changes
     * outside of the specific min. and max. temperatures.
     */
        //public static int reading() {
        // final double CUTOFF = 0.8;     // 80% chance to continue temp. trend
        // final int MAXCHANGE = 200;     // maximum change in 1/100ths degree
        // final int MINCHANGE = 100;     // minimum change in 1/100ths degree
        // int tempChange;                // absolute value of the temp. change

        // if ( rand.nextDouble() > CUTOFF ) {
        //     increasing = ! increasing;         // switch direction
        // }

        // tempChange = rand.nextInt(MAXCHANGE - MINCHANGE) + MAXCHANGE;
        // currentReading = currentReading + tempChange * (increasing ? 1 : -1);

        // /*
        //  * Limit readings to the specified (simulated) range.
        //  */
        // if( currentReading >= MAXREADING ) {
        //     currentReading = MAXREADING;
        //     increasing = false;
        // } else if (currentReading <= MINREADING ) {
        //     currentReading = MINREADING;
        //     increasing = true;
        // }
