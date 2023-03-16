package Game;

import java.util.ArrayList;
import java.util.Random;

/**
 * Класс базовый герой
 */

public abstract class BaseHero implements Interface {

    protected Random rnd = new Random();

    //private String name;
    public int hp;
    private int maxHp;
    private int speed;
    private final String NAME;
    public int damage; //урон
    private Positions position;
    private int protection; //защита


    public void getNAME() {
        System.out.println(NAME);
    }

    public BaseHero(String name, int hp, int maxHp, int speed, int damage,int protection, int x,int y) {
        NAME = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
        this.protection = protection;
        position = new Positions(x,y);
        
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public void attack(BaseHero target, int damage, int maxDamage) {
        int causedDamage;
        if(damage < target.protection) causedDamage = damage;
        else {
            switch (new Random().nextInt(4)){
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
        }
        }

        System.out.printf("%s Атака %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("Сила атаки = %d\n", causedDamage);
        System.out.printf("%s hp= %d\n", target.getClass().getSimpleName(), target.hp);
        target.getDamage(causedDamage);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2){
        System.out.println("Ход");
    };

    @Override
    public String getInfo(){
        return "";
    }

    public int getSpeed() {
        return this.speed;
    }

    // public int getMaxHp() {
    //     return maxHp;
    // };

    // public int getProtection() {
    //     return protection;
    // }

}
