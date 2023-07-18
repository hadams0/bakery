import java.util.ArrayList;

public class Bakery {
    private String name;
    private ArrayList<Cake> stock;
    private double tillBalance;

    public Bakery(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.tillBalance = 0;
    }

    public void addItemToStock(Cake cake) {
        stock.add(cake);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cake> getStock() {
        return stock;
    }

    public double getTillBalance() {
        return tillBalance;
    }
}

