package pets_amok;

public class OrganicDog extends VirtualPets implements Organic {

    protected int cageCleanliness;
    protected int hunger;
    protected int thirst;
    protected int amountOfWaste;

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.hunger = 60;
        this.thirst = 60;
    }

    @Override
    public void feed() {

    }

    @Override
    public void water() {

    }

    @Override
    public void cleanWaste() {

    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    @Override
    public void walkDogs() {

    }

    @Override
    public int getAmountOfWaste() {
        return 0;
    }

    @Override
    public void amountOfWaste() {

    }

    public int getHappiness() {
        return happiness;
    }


    @Override
    public int cleanCage() {
        cageCleanliness = 100;
        return cageCleanliness;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    @Override
    public void playWithPet() {
        boredom = 0;
        happiness += 10;
    }

    @Override
    public void feedOrganicPets() {
        hunger = hunger - 10;
    }

    @Override
    public void waterOrganicPets() {
        thirst = thirst - 15;
    }


    @Override
    public void tick() {
        hunger -= 5;
        thirst -= 4;
        amountOfWaste += 2;
    }


}
