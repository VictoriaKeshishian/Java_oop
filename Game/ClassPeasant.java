package Game;

import java.util.ArrayList;

/**
 * Это класс Крестьянин
 */

public class ClassPeasant extends BaseHero {

    public int energy = 6;

    public ClassPeasant(String name) {
        super(name, 1,1,3,1,1,0,0);
        
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // System.out.println("Очередь Крестьянина!");
    }

    @Override
    public String getInfo() {
        return "Paesant";
    }
  

}
