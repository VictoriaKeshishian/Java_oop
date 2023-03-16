package Game.MagClass;

import Game.BaseHero;

/**
 * Это класс магов
 */

public abstract class MagClass extends BaseHero {

    protected int mana;

    public MagClass(String name, int hp, int maxHp, int speed, int mana,int damage,int protection) {
        super(name, hp, maxHp, speed, damage, protection, maxHp, protection);
        this.mana = mana;
    
    }
 
    
}
