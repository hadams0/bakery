import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CakeTest {

    @BeforeEach
    public void setUp() {
        Cake cake = new Cake("Classic Cake", 200, "Vanilla");
    }
    @Test
    public void testGetName() {
        Cake cake = new Cake("Classic Cake", 200, "Vanilla");
        assertThat(cake.getName()).isEqualTo("Classic Cake");
    }

    @Test
    public void testGetCalories() {
        Cake cake = new Cake("Classic Cake", 200, "Vanilla");
        assertThat(cake.getCalories()).isEqualTo(200);
    }

    @Test
    public void testGetBaseFlavour() {
        Cake cake = new Cake("Classic Cake", 200, "Vanilla");
        assertThat(cake.getBaseFlavour()).isEqualTo("Vanilla");
    }
}
