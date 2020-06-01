package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    @Test
    public void addPetToShelter() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet = new OrganicDog("Rex", "A very good boy");
        underTest.addPetToShelter(organicPet);
    }

    @Test
    public void removePetFromShelter() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet = new OrganicDog("Rex", "A very good boy");
        underTest.removePetFromShelter(organicPet);
    }

    @Test
    public void hungerShouldDecreaseWhenFed() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet1 = new OrganicDog("Rex", "A very good boy");
        OrganicDog organicPet2 = new OrganicDog("Mayla", "A beautiful golden girl");
        underTest.addPetToShelter(organicPet1);
        underTest.addPetToShelter(organicPet2);
        assertEquals(20, organicPet1.getHunger());
        assertEquals(20, organicPet2.getHunger());
        underTest.feedOrganicPets();
        assertEquals(10, organicPet1.getHunger());
        assertEquals(10, organicPet2.getHunger());
    }

    @Test
    public void thirstShouldDecreaseWhenWatered() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet1 = new OrganicDog("Rex", "A very good boy");
        OrganicDog organicPet2 = new OrganicDog("Mayla", "A beautiful golden girl");
        underTest.addPetToShelter(organicPet1);
        underTest.addPetToShelter(organicPet2);
        assertEquals(20, organicPet1.getThirst());
        assertEquals(20, organicPet2.getThirst());
        underTest.waterOrganicPets();
        assertEquals(5, organicPet1.getThirst());
        assertEquals(5, organicPet2.getThirst());

    }

    @Test
    public void oilShouldIncreaseWhenCalled() {
        Shelter underTest = new Shelter();
        RoboticPets roboticPet1 = new RoboticPets("Borkbot 3000", "A mechanical spaz");
        RoboticPets roboticPet2 = new RoboticPets("Rover", "A silver box filled with bolts");
        underTest.addPetToShelter(roboticPet1);
        underTest.addPetToShelter(roboticPet2);
        assertEquals(60, roboticPet1.getOilLevel());
        assertEquals(60, roboticPet2.getOilLevel());
        underTest.oilRoboticPets();
        assertEquals(80, roboticPet1.getOilLevel());
        assertEquals(80, roboticPet2.getOilLevel());

    }
}
