package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {
    public static Map<String, VirtualPets> petMap = new HashMap<>();

    public static Map<String, VirtualPets> getPetMap() {
        return petMap;
    }

    public Collection getPetCollection() {
        return petMap.keySet();
    }


    public void addPetToShelter(VirtualPets petToAdd) {
        petMap.put(petToAdd.getPetName(), petToAdd);
    }

    public void removePetFromShelter(VirtualPets petToRemove) {
        petMap.remove(petToRemove.getPetName());
    }

    public VirtualPets returnPetFromName(String petName) {
        return petMap.get(petName);
    }

    public void walkAllDogs() {
        for (VirtualPets pets : petMap.values()) {
            if (pets instanceof OrganicDog) {
                pets.playWithPet();
            }
        }
    }

    public void playWithPet(String petChoice) {
        for (VirtualPets pets : petMap.values()) {
            if (pets instanceof OrganicCat) {
                ((Organic) pets).playWithPet();
            }
        }
    }


    public void feedOrganicPets() {
        for (VirtualPets organicPet : petMap.values()) {
            if (organicPet instanceof Organic) {
                ((Organic) organicPet).feedOrganicPets();
            }
        }
    }

    public void waterOrganicPets() {
        for (VirtualPets organicPet : petMap.values()) {
            if (organicPet instanceof Organic) {
                ((Organic) organicPet).waterOrganicPets();
            }
        }
    }

    public void cleanWaste() {
        for (VirtualPets organicPet : petMap.values()) {
            if (organicPet instanceof Organic) {
                ((Organic) organicPet).cleanCage();
            }
        }
    }

    public void oilRoboticPets() {
        for (VirtualPets roboticPet : petMap.values()) {
            if (roboticPet instanceof Robotic) {
                ((Robotic) roboticPet).oilRoboticPets();
            }
        }
    }

    public void tick() {
        for (VirtualPets pets : petMap.values()) {
            pets.tick();
        }
    }

}

