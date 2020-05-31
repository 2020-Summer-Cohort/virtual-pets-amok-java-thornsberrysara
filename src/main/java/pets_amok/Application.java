package pets_amok;

import java.util.Collection;
import java.util.Map;
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

        int select;

        do {
            System.out.println("Please view the status of your pets.");
            Map<String, VirtualPets> petsMap = shelter.getPetsMap();
            for (VirtualPets virtualPets : petsMap.values()) {
                if (virtualPets instanceof Organic) {
                    System.out.println(virtualPets.getPetName() + "\n" +
                            "\tHappiness: " + virtualPets.getHappiness() + "\n" +
                            "\tBoredom: " + virtualPets.getBoredom() + "\n" +
                            "\tHealth: " + virtualPets.getHealth() + "\n" +
                            "\tHunger: " + ((Organic) virtualPets).getHunger() + "\n" +
                            "\tThirst: " + ((Organic) virtualPets).getThirst() + "\n" +
                            "\tCage Cleanliness: " + ((Organic) virtualPets).getAmountOfWaste());
                }else if (virtualPets instanceof Robotic) {
                    System.out.println(virtualPets.getPetName() + "\n" +
                            "\tHappiness: " + virtualPets.getHappiness() + "\n" +
                            "\tBoredom: " + virtualPets.getBoredom() + "\n" +
                            "\tHealth: " + virtualPets.getHealth() + "\n" +
                            "\tOil Level: " + ((Robotic) virtualPets).getOil());
                }
            }
            System.out.println("\nWhat would you like to do?");
            System.out.println("Press [1] to feed organic pets.");
            System.out.println("Press [2] to water organic pets");
            System.out.println("Press [3] to clean cages.");
            System.out.println("Press [4] to oil robotic pets.");
            System.out.println("Press [5] to play with a pet.");
            System.out.println("Press [6] to walk dogs.");
            System.out.println("Press [7] to admit a pet.");
            System.out.println("Press [8] to adopt a pet.");
            System.out.println("Press [0] to go home.");

            select = input.nextInt();
            shelter.tick();
        } while (select != 0);
    }
}

