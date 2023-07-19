public class ChocolateCake extends Cake {
    private String typeOfChocolate;
    private int minutesInOven;

    public ChocolateCake(String name, int calories, String baseFlavour, String typeOfChocolate, int minutesInOven) {
        super(name, calories, baseFlavour);
        this.typeOfChocolate = typeOfChocolate;
        this.minutesInOven = minutesInOven;
    }

    public String getTypeOfChocolate() {
        return this.typeOfChocolate;
    }

    public int getMinutesInOven() {
        return this.minutesInOven;
    }
}
