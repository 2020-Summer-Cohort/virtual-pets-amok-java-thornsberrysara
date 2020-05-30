package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {
    public Map<String, VirtualPets> petsMap = new HashMap<>();

    public Collection<VirtualPets> virtualPets() {
        return virtualPets();
    }

    public void addPetToShelter(OrganicDog organicPet, RoboticPets roboticPet) {
        petsMap.put(organicPet.getPetName(), organicPet);
        petsMap.put(roboticPet.getPetName(), roboticPet);
    }

    public void removePetFromShelter(OrganicDog organicPet, RoboticPets roboticPet) {
        petsMap.remove(organicPet.getPetName(), organicPet);
        petsMap.remove(roboticPet.getPetName(), roboticPet);
    }

    public Collection<VirtualPets> listPets() {
        return petsMap.values();
    }

    public void tick() {
        for (VirtualPets pets : virtualPets()) {
            pets.tick();
        }
    }

    public void feedOrganicPets() {
        for (VirtualPets organicPet : virtualPets()) {
            if (organicPet instanceof Organic) {
                ((Organic) organicPet).feedOrganicPets();
            }
        }
    }

    public void waterOrganicPets() {
        for (VirtualPets organicPet : virtualPets()) {
            if (organicPet instanceof Organic) {
                ((Organic) organicPet).waterOrganicPets();
            }
        }
    }

    public void oilRoboticPets() {
        for (VirtualPets roboticPet : virtualPets()) {
            if (roboticPet instanceof Robotic) {
                ((Robotic) roboticPet).oilRoboticPets();
            }
        }
    }

    public void addPetToShelter(VirtualPets pets) {

    }
}
