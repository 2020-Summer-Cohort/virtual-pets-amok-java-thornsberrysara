package pets_amok;

public class OrganicDog extends VirtualPets implements Organic {

    protected int cageCleanliness;
    protected int hunger;
    protected int thirst;

    public OrganicDog(String petName, String petDescription) {
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
    public int playWithPet() {
        boredom = 0;
        happiness += 10;
        return happiness;
    }


    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }


    public int getHappiness() {
        return happiness;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }


    @Override
    public int cleanCage() {
        cageCleanliness = 100;
        return cageCleanliness;
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

}
