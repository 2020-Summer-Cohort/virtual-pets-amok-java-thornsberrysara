package pets_amok;

public class RoboticPets extends VirtualPets implements Robotic {

    protected int oilLevel;

    public RoboticPets(String petName, String petDescription) {
        super(petName, petDescription);
        this.oilLevel = 60;
    }

    @Override
    public void tick() {
        oilLevel -= 5;
        if (oilLevel <= 30) {
            health -= 5;
        }
    }

    @Override
    public int playWithPet() {
        boredom = 0;
        happiness += 10;
        return happiness;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public int getOil() {
        return oilLevel;
    }

    public void oilRoboticPets() {
        oilLevel = oilLevel + 20;
    }
}
