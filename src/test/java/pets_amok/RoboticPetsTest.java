package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticPetsTest {

    @Test
    public void shouldHaveDefaultOilLevel() {
        RoboticPets underTest = new RoboticPets("Borkbot 3000", "A mechanical spaz", 80, 20, 80);
        int oilLevel = underTest.getOilLevel();
        assertEquals(60, oilLevel);
    }
}
