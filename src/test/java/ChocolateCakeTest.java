import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChocolateCakeTest {

    ChocolateCake chocolateCake;

    @BeforeEach
    public void setUp(){
        chocolateCake = new ChocolateCake("Choco Cake", 300, "Chocolate", "Dark Chocolate", 40);
    }

    @Test
    public void testGetTypeOfChocolate() {

        assertThat(chocolateCake.getTypeOfChocolate()).isEqualTo("Dark Chocolate");
    }

    @Test
    public void testGetMinutesInOven() {
        assertThat(chocolateCake.getMinutesInOven()).isEqualTo(40);
    }
}
