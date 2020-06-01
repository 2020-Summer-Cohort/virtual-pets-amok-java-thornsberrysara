package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {
    @Test
    public void shouldHaveDefaultHunger() {
        OrganicCat underTest = new OrganicCat("Mittens", "A mischievous tuxedo cat");
        int hunger = underTest.getHunger();
        assertEquals(60, hunger);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        OrganicCat underTest = new OrganicCat("Mittens", "A mischievous tuxedo cat");
        int thirst = underTest.getThirst();
        assertEquals(60, thirst);
    }
}
