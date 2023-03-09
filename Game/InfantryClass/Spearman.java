package Game.InfantryClass;



/**
 * Это класс Копейщик
 */

public class Spearman extends InfantryClass {

    public Spearman(String name) {
        super(name, 100, 100, 7, 60, 14 );
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }


}
