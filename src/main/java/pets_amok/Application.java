package pets_amok;

import java.util.Map;
import java.util.Scanner;

public class Application {
    private static Shelter shelter = new Shelter();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pets AMOK!");
        VirtualPets dog = new OrganicDog("Rex", "A very good boy");
        shelter.addPetToShelter(dog);
        VirtualPets cat = new OrganicCat("Mittens", "A mischievous tuxedo cat");
        shelter.addPetToShelter(cat);
        VirtualPets robot = new RoboticPets("Borkbot 3000", "A mechanical spaz");
        shelter.addPetToShelter(robot);

        int select;

        do {
            System.out.println("Please view the status of your pets.");
            Map<String, VirtualPets> petsMap = shelter.getPetMap();
            System.out.println(petsMap.values());
            for (VirtualPets virtualPets : petsMap.values()) {
                if (virtualPets instanceof Organic) {
                    System.out.println(virtualPets.getPetName() + "\n" +
                            "\tHappiness: " + virtualPets.getHappiness() + "\n" +
                            "\tBoredom: " + virtualPets.getBoredom() + "\n" +
                            "\tHealth: " + virtualPets.getHealth() + "\n" +
                            "\tHunger: " + ((Organic) virtualPets).getHunger() + "\n" +
                            "\tThirst: " + ((Organic) virtualPets).getThirst() + "\n" +
                            "\tCage Cleanliness: " + ((Organic) virtualPets).getAmountOfWaste());
                } if (virtualPets instanceof Robotic) {
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
            petAction(select, shelter);

        } while (select != 0);
    }

    public static void petAction(int select, Shelter shelter) {
        Scanner input = new Scanner(System.in);
        if (select == 1) {
            shelter.feedOrganicPets();
            System.out.println("Your organic pets have been fed.");
        } else if (select == 2) {
            shelter.waterOrganicPets();
            System.out.println("Your organic pets are now hydrated.");
        } else if (select == 3) {
            shelter.cleanWaste();
            System.out.println("The cages have been cleaned.");
        } else if (select == 4) {
            shelter.oilRoboticPets();
            System.out.println("You filled the robotic pets' oil.");
        } else if (select == 5) {
            System.out.println("Who would you like to play with?");
            System.out.println(Shelter.getPetMap());
            String petChoice = input.nextLine();
            shelter.playWithPet(petChoice);
            System.out.println("You played with " + petChoice + ".");
        } else if (select == 6) {
            shelter.walkAllDogs();
            System.out.println("You took the dogs for a walk.");
        } else if (select == 7) {
            System.out.println("Sure, we have room for another pet. Press [1] for Organic Dog, [2] for Organic Cat, or [3] for Robotic.");
            String petToAddName = input.nextLine();
            String petToAddDescription = input.nextLine();
            int typeOfPet = input.nextInt();
            if (typeOfPet == 1) {
                VirtualPets petToAdd = new OrganicDog(petToAddName, petToAddDescription);
                shelter.addPetToShelter(petToAdd);
            } else if (typeOfPet == 2) {
                VirtualPets petToAdd = new OrganicCat(petToAddName, petToAddDescription);
                shelter.addPetToShelter(petToAdd);
            } else if (typeOfPet == 3) {
                VirtualPets petToAdd = new RoboticPets(petToAddName, petToAddDescription);
                shelter.addPetToShelter(petToAdd);
            }
            System.out.println("Please type a short description about " + petToAddName);
            System.out.println("You added " + petToAddName);
        } else if (select == 8) {
            System.out.println("We would love to give a pet a new home! Who would you like to adopt?");
            String adoptionChoice = input.nextLine();
            shelter.removePetFromShelter(shelter.returnPetFromName(adoptionChoice));
            System.out.println("Thank you for adopting " + adoptionChoice + "!");
        } else if (select == 0) {
            System.out.println("You're leaving already? See you soon!");
        }
    }
}

