package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

    @Test
    public void shouldHaveDefaultHunger() {
        OrganicDog underTest = new OrganicDog("Rex", "A very good boy");
        int hunger = underTest.getHunger();
        assertEquals(20, hunger);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        OrganicDog underTest = new OrganicDog("Rex", "A very good boy");
        int thirst = underTest.getThirst();
        assertEquals(20, thirst);
    }

}
