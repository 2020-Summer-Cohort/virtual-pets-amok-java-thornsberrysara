package pets_amok;

public class OrganicCat extends VirtualPets implements Organic {
    protected int hunger;
    protected int thirst;
    protected int cageCleanliness;

    public OrganicCat(String petName, String petDescription) {
        super(petName, petDescription);
        this.hunger = 20;
        this.thirst = 20;
    }

    @Override
    public int feedOrganicPets() {
        hunger = hunger - 10;
        return hunger;
    }

    @Override
    public int waterOrganicPets() {
        thirst = thirst - 15;
        return thirst;
    }


    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public int getThirst() {
        return thirst;
    }

    @Override
    public int getCageCleanliness() {
        return cageCleanliness;
    }


    @Override
    public int cleanCage() {
        return 0;
    }


    @Override
    public void tick() {
        hunger += 4;
        thirst += 5;
        boredom += 3;
        if (hunger >= 60) {
            health -= 5;
        }
        if (thirst >= 60) {
            health -= 5;
        }
        if (boredom <= 60) {
            health -= 5;
        }

    }

    @Override
    public void playWithPet() {

    }

}
