package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetsTest {

    @Test
    public void shouldCreateVirtualPetsClass() {
        VirtualPets underTest = new VirtualPets ("Rex", "A very good boy", 80, 20, 80);
    }

    @Test
    public void shouldCreateVirtualPets() {
        VirtualPets underTest = new VirtualPets("Rex", "A very good boy", 80, 20, 80);
        String petName = underTest.getPetName();
        String petDescription = underTest.getPetDescription();
        assertEquals("Rex", petName);
        assertEquals("A very good boy", petDescription);
    }

    @Test
    public void shouldHaveDefaultHappiness() {
        VirtualPets underTest = new VirtualPets("Rex", "A very good boy", 80, 20, 80);
        int happiness = underTest.getHappiness();
        assertEquals(80, happiness);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPets underTest = new VirtualPets("Rex", "A very good boy", 80, 20, 80);
        int boredom = underTest.getBoredom();
        assertEquals(20, boredom);
    }

    @Test
    public void shouldHaveDefaultHealth() {
        VirtualPets underTest = new VirtualPets("Rex", "A very good boy", 80, 20, 80);
        int health = underTest.getHealth();
        assertEquals(80, health);
    }


}
