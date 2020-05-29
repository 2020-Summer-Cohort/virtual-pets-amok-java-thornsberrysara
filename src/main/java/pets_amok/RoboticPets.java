package pets_amok;

public class RoboticPets extends VirtualPets {

    protected int oilLevel;

    public RoboticPets(String petName, String petDescription, int happiness, int boredom, int health) {
        super(petName, petDescription, happiness, boredom, health);
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
