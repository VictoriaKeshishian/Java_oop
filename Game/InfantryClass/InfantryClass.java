package Game.InfantryClass;

import Game.BaseHero;

/**
 * Это класс пехота
 */

public abstract class InfantryClass extends BaseHero {

    //int stamina;


    public InfantryClass(String name, int hp, int speed,int damage, int protection, int x, int y) {
        super(name, hp, speed, damage, protection, x, y);
        //this.stamina = stamina;
      
    }    
    
    // @Override
    // public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends){
        
    // }
}
