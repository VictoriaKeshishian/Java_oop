package Game;


import Game.InfantryClass.Outlaw;
import Game.InfantryClass.Spearman;
//import Game.InfantryClass.*;
import Game.MagClass.*;
//import Game.ShooterClass.*;
import Game.ShooterClass.Crossbowman;
import Game.ShooterClass.Snipper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
//import Game.Interface;


public class Programm {
    public static void main(String[] args) {
        
        ArrayList<BaseHero> enemies = new ArrayList<>();
        ArrayList<BaseHero> friends = new ArrayList<>();
        ArrayList<BaseHero> result = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                switch(new Random().nextInt(4)){
                    case 0:
                     enemies.add(new ClassPeasant(getName()));
                        break;
                    case 1:
                     enemies.add(new Snipper(getName()));
                        break;
                    default:
                     enemies.add(new Outlaw(getName()));
                        break;
                }
                switch(new Random().nextInt(4)){
                    case 0:
                        friends.add(new ClassPeasant(getName()));
                        break;
                    case 1:
                        friends.add(new Spearman(getName()));
                        break;
                    case 2:
                        friends.add(new Monk(getName()));
                        break;
                    default:
                        friends.add(new Crossbowman(getName()));
                        break;
                }
            }
            result.addAll (enemies);
            result.addAll(friends);
            result.sort(new Comparator<BaseHero>() {
                @Override
                public int compare (BaseHero b1, BaseHero b2){
                    if(b1.getSpeed() == b2.getSpeed())
                    return 0;
                    else if(b1.getSpeed() > b2.getSpeed())
                    return 1;
                    else return -1;
                }
            });

            System.out.println("Команда врага");
            for (BaseHero hero : enemies) {
                System.out.print(" - " + hero.getInfo() + " - ");
                hero.getNAME();
            }

            System.out.println("Команда союзника");
            for (BaseHero hero : friends) {
                System.out.print(" - " + hero.getInfo() + " - ");
                hero.getNAME();
            }

            enemies.forEach(u -> u.step(enemies, friends));

        }

        private static String getName(){
            return Names.values()[new Random().nextInt(Names.values().length)].toString();
        }

}
