package Game.ShooterClass;

import java.util.ArrayList;

import Game.BaseHero;

/**
 * Это класс стрелков
 */

public abstract class ShooterClass extends BaseHero {
    protected int arrows;
    protected int maxDamage;

  

    public ShooterClass(String name, int hp, int maxHp, int speed,int arrows,int damage,int maxDamage,int protection) {
        super(name, hp, maxHp, speed, damage, protection, maxDamage, protection);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends){
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            for (BaseHero hero : enemies) {
                if (hero.hp > 0) {
                    this.attack(hero, this.damage, this.maxDamage);
                    this.arrows --;
                    break;
                }else
                 System.out.println("Пропускаю шаг");
            }
        }

        System.out.println("Осталось стрел:" + String.valueOf(this.arrows));
    
        for (BaseHero hero : friends) {
            if (hero.getInfo().equals("ClassPeasant")) {
                this.arrows++;
                break;
            }   
        }
        System.out.println("Осталось стрел:" + String.valueOf(this.arrows));   
}
}
