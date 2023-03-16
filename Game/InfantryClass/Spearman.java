package Game.InfantryClass;



/**
 * Это класс Копейщик
 */

public class Spearman extends InfantryClass {

    public Spearman(String name) {
        super(name,15,15,9,10,10);
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }


}
