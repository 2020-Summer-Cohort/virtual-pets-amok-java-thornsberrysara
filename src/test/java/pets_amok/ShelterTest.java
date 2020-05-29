package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    @Test
    public void addPetToShelter() {
        Shelter underTest = new Shelter();
        OrganicPets organicPet = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        RoboticPets roboticPet = new RoboticPets("Borkbot 3000", "A mechanical spaz", 80, 20, 80);
        underTest.addPetToShelter(organicPet, roboticPet);
    }

    @Test
    public void removePetFromShelter() {
        Shelter underTest = new Shelter();
        OrganicPets organicPet = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        RoboticPets roboticPet = new RoboticPets("Borkbot 3000", "A mechanical spaz", 80, 20, 80);
        underTest.removePetFromShelter(organicPet, roboticPet);
    }

    @Test
    public void feedOrganicPets() {
        Shelter underTest = new Shelter();
        OrganicPets organicPet1 = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        OrganicPets organicPet2 = new OrganicPets("Mayla", "A beautiful golden girl", 80, 20, 80);
        assertEquals(60, organicPet1.getHunger());
        assertEquals(60, organicPet2.getHunger());
        underTest.feedOrganicPets();
        assertEquals(80, organicPet1.feedOrganicPets());
        assertEquals(80, organicPet2.feedOrganicPets());
    }

    @Test
    public void waterOrganicPets() {
        Shelter underTest = new Shelter();
        OrganicPets organicPet1 = new OrganicPets("Rex", "A very good boy", 80, 20, 80);
        OrganicPets organicPet2 = new OrganicPets("Mayla", "A beautiful golden girl", 80, 20, 80);
        assertEquals(60, organicPet1.getThirst());
        assertEquals(60, organicPet2.getThirst());
        underTest.waterOrganicPets();
        assertEquals(75, organicPet1.waterOrganicPets());
        assertEquals(75, organicPet2.waterOrganicPets());
    }

    @Test
    public void oilRoboticPets() {
        Shelter underTest = new Shelter();
        RoboticPets roboticPet1 = new RoboticPets("Borkbot 3000", "A mechanical spaz", 80, 20, 80);
        RoboticPets roboticPet2 = new RoboticPets("Rover", "A silver box filled with bolts", 80, 20, 80);
        assertEquals(60, roboticPet1.getOilLevel());
        assertEquals(60, roboticPet2.getOilLevel());
        underTest.oilRoboticPets();
        assertEquals(80, roboticPet1.oilRoboticPets());
        assertEquals(80, roboticPet2.oilRoboticPets());
    }
}
