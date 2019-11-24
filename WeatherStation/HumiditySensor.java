public class HumiditySensor {
  private final int DEFAULT = Integer.MIN_VALUE;
  private int currReading; // current sensor reading

  public HumiditySensor() {
    this.currReading = DEFAULT;
  }

  public static int readHumidity() {
    return (int)Math.ceil(100 * Math.random());
  }

}
