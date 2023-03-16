package Game.InfantryClass;

import Game.BaseHero;

/**
 * Это класс пехота
 */

public abstract class InfantryClass extends BaseHero {


    public InfantryClass(String name, int hp, int maxHp, int speed,int damage, int protection) {
        super(name, hp, maxHp, speed, damage, protection, maxHp, protection);
      
    }    
    
}
