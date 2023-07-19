import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TraybakeTest {

    Traybake traybake;

   @BeforeEach
   public void setUp(){
       traybake = new Traybake("Brownie Traybake", 250, "Chocolate", 12, 30);
   }


    @Test
    public void testGetNumberOfSlices() {
        assertThat(traybake.getNumberOfSlices()).isEqualTo(12);
    }

    @Test
    public void testGetMinutesInFridge() {
        assertThat(traybake.getMinutesInFridge()).isEqualTo(30);
    }
}
