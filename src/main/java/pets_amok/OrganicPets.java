package pets_amok;

public class OrganicPets extends VirtualPets {

    protected int hunger;
    protected int thirst;

    public OrganicPets(String petName, String petDescription, int happiness, int boredom, int health) {
        super(petName, petDescription, happiness, boredom, health);
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
}
