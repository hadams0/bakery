import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TraybakeTest {
    @Test
    public void testGetNumberOfSlices() {
        Traybake traybake = new Traybake("Brownie Traybake", 250, "Chocolate", 12, 30);
        assertThat(traybake.getNumberOfSlices()).isEqualTo(12);
    }

    @Test
    public void testGetMinutesInFridge() {
        Traybake traybake = new Traybake("Brownie Traybake", 250, "Chocolate", 12, 30);
        assertThat(traybake.getMinutesInFridge()).isEqualTo(30);

    }
}
