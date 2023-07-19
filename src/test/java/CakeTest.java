import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CakeTest {

    Cake cake;

    @BeforeEach
    public void setUp() {
        cake = new Cake("Classic Cake", 200, "Vanilla");
    }
    @Test
    public void testGetName() {
        assertThat(cake.getName()).isEqualTo("Classic Cake");
    }

    @Test
    public void testGetCalories() {
        assertThat(cake.getCalories()).isEqualTo(200);
    }

    @Test
    public void testGetBaseFlavour() {
        assertThat(cake.getBaseFlavour()).isEqualTo("Vanilla");
    }
}
