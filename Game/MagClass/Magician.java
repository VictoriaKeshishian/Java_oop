package Game.MagClass;

/**
 * Это класс колдун
 */



public class Magician extends MagClass {

    public Magician(String name) {
        super(name, 80, 80, 6, 200, 14);
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

    
}
