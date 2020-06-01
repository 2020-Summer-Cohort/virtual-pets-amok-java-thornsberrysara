package pets_amok;

public class OrganicCat extends VirtualPets implements Organic {
    protected int hunger;
    protected int thirst;

    public OrganicCat(String petName, String petDescription) {
        super(petName, petDescription);
        this.hunger = 60;
        this.thirst = 60;
    }

    @Override
    public void feed() {
        hunger = hunger - 10;
    }

    @Override
    public void water() {
        thirst = thirst - 15;
    }

    @Override
    public void cleanWaste() {

    }

    @Override
    public int getHunger() {
        return 0;
    }

    @Override
    public int getThirst() {
        return 0;
    }

    @Override
    public void walkDogs() {

    }


    @Override
    public int getAmountOfWaste() {
        return 0;
    }


    @Override
    public void feedOrganicPets() {

    }

    @Override
    public void waterOrganicPets() {

    }

    @Override
    public void amountOfWaste() {

    }

    @Override
    public int cleanCage() {
        return 0;
    }


    @Override
    public void tick() {
        hunger -= 5;
        thirst -= 4;
    }

    @Override
    public void playWithPet() {

    }

}
