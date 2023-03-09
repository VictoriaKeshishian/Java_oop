package Game.ShooterClass;

/**
 * Это класс Снайпер
 */



public class Snipper extends ShooterClass {

    public Snipper(String name) {
        super(name, 80,80,10,75,8);
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Snipper";
    }

}
