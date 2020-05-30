package pets_amok;

import java.util.Collection;
import java.util.Scanner;

public class Application {
    private static Shelter shelter = new Shelter();
    protected static Collection<VirtualPets> virtualPets = shelter.listPets();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pets AMOK!");
        shelter.addPetToShelter(new OrganicDog("Rex", "A very good boy"));
        shelter.addPetToShelter(new OrganicCat("Mittens", "A mischievous tuxedo cat"));
        shelter.addPetToShelter(new RoboticPets("Borkbot 3000", "A mechanical spaz"));

    }
}

