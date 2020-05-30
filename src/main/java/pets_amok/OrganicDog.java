package pets_amok;

public class OrganicDog extends VirtualPets implements Organic {

    protected int hunger;
    protected int thirst;
    protected int amountOfWaste;

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.hunger = 60;
        this.thirst = 60;
        this.amountOfWaste = 0;
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
    public int amountOfWaste() {
        return 0;
    }

    @Override
    public void feedOrganicPets() {

    }

    @Override
    public void waterOrganicPets() {

    }

    @Override
    public void cleanCage() {

    }

    public int getAmountOfWaste() {
        return amountOfWaste;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setAmountOfWaste(int amountOfWaste) {
        this.amountOfWaste = amountOfWaste;
    }


    @Override
    public void tick() {
        hunger -= 5;
        thirst -= 4;
        amountOfWaste += 2;
    }


}
