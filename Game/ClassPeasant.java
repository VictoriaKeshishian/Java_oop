package Game;

/**
 * Это класс Крестьянин
 */

public class ClassPeasant extends BaseHero {

    public int energy = 6;

    public ClassPeasant(String name) {
        super(name,60,60,4);
        
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    @Override
    public String getInfo() {
        return "Paesant";
    }
  

}
