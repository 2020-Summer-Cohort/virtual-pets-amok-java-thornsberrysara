package pets_amok;

public class RoboticPets extends VirtualPets {

    protected int oilLevel;

    public RoboticPets(String petName, String petDescription) {
        super(petName, petDescription);
        this.oilLevel = 60;
    }

    @Override
    public void tick() {

    }

    @Override
    public void playWithPet() {

    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int oilRoboticPets() {
        oilLevel = oilLevel + 20;
        return oilLevel;
    }
}
