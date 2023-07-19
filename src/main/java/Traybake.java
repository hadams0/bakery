public class Traybake extends Cake {
    private int numberOfSlices;
    private int minutesInFridge;

    public Traybake(String name, int calories, String baseFlavour, int numberOfSlices, int minutesInFridge) {
        super(name, calories, baseFlavour);
        this.numberOfSlices = numberOfSlices;
        this.minutesInFridge = minutesInFridge;
    }

    public int getNumberOfSlices() {
        return this.numberOfSlices;
    }

    public int getMinutesInFridge() {
        return this.minutesInFridge;
    }
}
