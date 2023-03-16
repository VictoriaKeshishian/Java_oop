package Game.MagClass;

/**
 * Это класс Монах
 */


public class Monk extends MagClass {

    public Monk(String name) {
        super(name, 30, 30, 5, 1, -4,7);
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    
}
