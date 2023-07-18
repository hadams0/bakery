import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class BakeryTest {

    @BeforeEach
    public void setUp(){
        Bakery bakery = new Bakery("My Bakery");
        Cake cake = new Cake("Classic Cake", 200, "Vanilla");
    }

    @Test
    public void testAddItemToStock() {
        Bakery bakery = new Bakery("My Bakery");
        Cake cake = new Cake("Classic Cake", 200, "Vanilla");
        bakery.addItemToStock(cake);

        ArrayList<Cake> stock = bakery.getStock();
        assertThat(bakery.getStock().size()).isEqualTo(1);
        assertThat(bakery.getStock().get(0)).isEqualTo(cake);
    }

    @Test
    public void canGetName(){
        Bakery bakery = new Bakery("My Bakery");
        assertThat(bakery.getName()).isEqualTo("My Bakery");
    }
    @Test
    public void canGetTillBalance(){
        Bakery bakery = new Bakery("My Bakery");
        assertThat(bakery.getTillBalance()).isEqualTo(0);
    }
    
    @Test
    public void canGetStock(){
        Bakery bakery = new Bakery("My Bakery");
        ArrayList<Cake> stock = new ArrayList<>();
        assertThat(bakery.getStock()).isEqualTo(stock);
    }


}
