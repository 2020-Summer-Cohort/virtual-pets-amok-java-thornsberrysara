package pets_amok;

public class RoboticPets extends VirtualPets implements Robotic {

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

    @Override
    public int getOil() {
        return 80;
    }

    public void oilRoboticPets() {
        oilLevel = oilLevel + 20;
    }
}
