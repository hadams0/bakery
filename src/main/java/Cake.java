public class Cake {
    private String name;
    private int calories;
    private String baseFlavour;

    public Cake(String name, int calories, String baseFlavour) {
        this.name = name;
        this.calories = calories;
        this.baseFlavour = baseFlavour;
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }
}
