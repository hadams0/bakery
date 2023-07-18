import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChocolateCakeTest {
    @Test
    public void testGetTypeOfChocolate() {
        ChocolateCake chocoCake = new ChocolateCake("Choco Cake", 300, "Chocolate", "Dark Chocolate", 40);
        assertThat(chocoCake.getTypeOfChocolate()).isEqualTo("Dark Chocolate");
    }

    @Test
    public void testGetMinutesInOven() {
        ChocolateCake chocoCake = new ChocolateCake("Choco Cake", 300, "Chocolate", "Dark Chocolate", 40);
        assertThat(chocoCake.getMinutesInOven()).isEqualTo(40);
    }
}
