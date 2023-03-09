package Game.MagClass;

/**
 * Это класс Монах
 */


public class Monk extends MagClass {

    public Monk(String name) {
        super(name, 110, 110, 10, 125, 9);
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    
}
