package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetsTest {

    @Test
    public void shouldHaveDefaultHunger() {
        OrganicPets underTest = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        int hunger = underTest.getHunger();
        assertEquals(60, hunger);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        OrganicPets underTest = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        int thirst = underTest.getThirst();
        assertEquals(60, thirst);
    }

    @Test
    public void hungerShouldIncreaseWhenFed() {
        OrganicPets underTest = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        OrganicPets pet1 = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        OrganicPets pet2 = new OrganicPets("Mayla", "A gentle golden girl", 80, 20, 80);


    }
}
