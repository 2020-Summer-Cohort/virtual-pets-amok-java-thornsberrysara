package pets_amok;

public abstract class VirtualPets {

    protected String petName;
    protected String petDescription;
    protected int happiness;
    protected int boredom;
    protected int health;


    public VirtualPets(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.happiness = 80;
        this.boredom = 20;
        this.health = 80;
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

    public abstract void tick();
    public abstract int playWithPet();
}
