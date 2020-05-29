package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {
    public Map<String, VirtualPets> petsMap = new HashMap<>();

    public Map<String, VirtualPets> getPetsMap() {
        return petsMap;
    }

    public Collection getPetCollection() {
        return petsMap.keySet();
    }

    public void addPetToShelter(OrganicPets organicPet, RoboticPets roboticPet) {
        petsMap.put(organicPet.getPetName(), organicPet);
        petsMap.put(roboticPet.getPetName(), roboticPet);
    }

    public void removePetFromShelter(OrganicPets organicPet, RoboticPets roboticPet) {
        petsMap.remove(organicPet.getPetName(), organicPet);
        petsMap.remove(roboticPet.getPetName(), roboticPet);
    }

    public void feedOrganicPets() {
        for (VirtualPets organicPet : petsMap.values()) {
            organicPet.feedOrganicPets();
        }
    }

    public void waterOrganicPets() {
        for (VirtualPets organicPet : petsMap.values()) {
            organicPet.waterOrganicPets();
        }
    }

    public void oilRoboticPets() {
        for (VirtualPets roboticPet : petsMap.values()) {
            roboticPet.oilRoboticPets();
        }
    }
}
