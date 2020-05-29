package pets_amok;

public class VirtualPets {

    protected String petName;
    protected String petDescription;
    protected int happiness;
    protected int boredom;
    protected int health;

    //Organic Pets
    protected int hunger;
    protected int thirst;

    //Robotic Pets
    protected int oilLevel;


    public VirtualPets(String petName, String petDescription, int happiness, int boredom, int health) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.happiness = 80;
        this.boredom = 20;
        this.health = 80;

        //Organic Pets
        this.hunger = 60;
        this.thirst = 60;

        //Robotic Pets
        this.oilLevel = 60;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealth() {
        return health;
    }

    public int feedOrganicPets() {
        hunger = hunger + 20;
        return hunger;
    }

    public int waterOrganicPets() {
        thirst = thirst + 15;
        return thirst;
    }

    public int oilRoboticPets() {
        oilLevel = oilLevel + 20;
        return oilLevel;
    }
}
