package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    @Test
    public void addPetToShelter() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet = new OrganicDog("Rex", "A very good boy");
        RoboticPets roboticPet = new RoboticPets("Borkbot 3000", "A mechanical spaz");
        underTest.addPetToShelter(organicPet, roboticPet);
    }

    @Test
    public void removePetFromShelter() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet = new OrganicDog("Rex", "A very good boy");
        RoboticPets roboticPet = new RoboticPets("Borkbot 3000", "A mechanical spaz");
        underTest.removePetFromShelter(organicPet, roboticPet);
    }

    @Test
    public void feedOrganicPets() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet1 = new OrganicDog("Rex", "A very good boy");
        OrganicDog organicPet2 = new OrganicDog("Mayla", "A beautiful golden girl");
        assertEquals(60, organicPet1.getHunger());
        assertEquals(60, organicPet2.getHunger());
        underTest.feedOrganicPets();
        //add another assert to show hunger has increased
    }

    @Test
    public void waterOrganicPets() {
        Shelter underTest = new Shelter();
        OrganicDog organicPet1 = new OrganicDog("Rex", "A very good boy");
        OrganicDog organicPet2 = new OrganicDog("Mayla", "A beautiful golden girl");
        assertEquals(60, organicPet1.getThirst());
        assertEquals(60, organicPet2.getThirst());
        underTest.waterOrganicPets();
        //add another assert to show thirst has increased
    }

    @Test
    public void oilRoboticPets() {
        Shelter underTest = new Shelter();
        RoboticPets roboticPet1 = new RoboticPets("Borkbot 3000", "A mechanical spaz");
        RoboticPets roboticPet2 = new RoboticPets("Rover", "A silver box filled with bolts");
        assertEquals(60, roboticPet1.getOilLevel());
        assertEquals(60, roboticPet2.getOilLevel());
        underTest.oilRoboticPets();
        assertEquals(80, roboticPet1.oilRoboticPets());
        assertEquals(80, roboticPet2.oilRoboticPets());
    }
}
