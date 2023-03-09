package Game.ShooterClass;

/**
 * Это класс Арбалетчик
 */



public class Crossbowman extends ShooterClass {

    public Crossbowman(String name) {
        super(name, 90, 90, 11, 120, 12);
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
    
}
