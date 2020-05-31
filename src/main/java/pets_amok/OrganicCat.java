package pets_amok;

public class OrganicCat extends VirtualPets implements Organic {
    protected int hunger;
    protected int thirst;
    protected int amountOfWaste;

    public OrganicCat(String petName, String petDescription) {
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
    public int getAmountOfWaste() {
        return amountOfWaste;
    }

    @Override
    public void amountOfWaste() {

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
    }

}
