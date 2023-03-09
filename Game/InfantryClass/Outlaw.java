package Game.InfantryClass;

/**
 * Класс Разбойник
 */

public class Outlaw extends InfantryClass {

    public Outlaw(String name) {
        super(name, 120,120, 16, 100, 9);
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Outlaw";
    }

    
    
}


