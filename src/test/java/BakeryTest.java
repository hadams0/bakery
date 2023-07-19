import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class BakeryTest {

    Bakery bakery;
    Cake cake;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery("My Bakery");
        cake = new Cake("Classic Cake", 200, "Vanilla");
    }

    @Test
    public void testAddItemToStock() {
        bakery.addItemToStock(cake);
        ArrayList<Cake> stock = bakery.getStock();
        assertThat(bakery.getStock().size()).isEqualTo(1);
        assertThat(bakery.getStock().get(0)).isEqualTo(cake);
    }

    @Test
    public void canGetName(){
        assertThat(bakery.getName()).isEqualTo("My Bakery");
    }
    @Test
    public void canGetTillBalance(){
        assertThat(bakery.getTillBalance()).isEqualTo(0);
    }

    @Test
    public void canGetStock(){
        ArrayList<Cake> stock = new ArrayList<>();
        assertThat(bakery.getStock()).isEqualTo(stock);
    }


}
