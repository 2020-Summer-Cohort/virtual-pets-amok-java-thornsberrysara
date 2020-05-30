package pets_amok;

public class RoboticPets extends VirtualPets {

    protected int oilLevel;

    @Override
    public void tick() {

    }

    public RoboticPets(String petName, String petDescription) {
        super(petName, petDescription);
        this.oilLevel = 60;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int oilRoboticPets() {
        oilLevel = oilLevel + 20;
        return oilLevel;
    }
}
