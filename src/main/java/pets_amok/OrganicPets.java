package pets_amok;

public class OrganicPets extends VirtualPets {

    protected int hunger;
    protected int thirst;

    public OrganicPets(String petName, String petDescription, int happiness, int boredom, int health) {
        super(petName, petDescription, happiness, boredom, health);
        this.hunger = 60;
        this.thirst = 60;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int feedOrganicPets() {
        hunger = hunger + 20;
        return hunger;
    }

    public int waterOrganicPets() {
        thirst = thirst + 15;
        return thirst;
    }

}
