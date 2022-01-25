import java.util.Random;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int  weight, int dodge){

        this.name=name;
        this.health=health;
        this.damage=damage;
        this.weight=weight;
        this.dodge=dodge;

    }

    int hit(Fighter foe){

        if (foe.isDodge(foe)){

            System.out.println(foe.name+", "+this.name+" oyuncusunun hamlesini savuşturdu");

            return foe.health;
        }
        else if (foe.health-this.damage>0){

            System.out.println(this.name+" oyuncusu "+foe.name+" oyuncusuna "+this.damage+" hasar verdi.");

            return foe.health-this.damage;
        }
        else{

            System.out.println(this.name+" oyuncusu "+foe.name+" oyuncusuna "+this.damage+" hasar verdi.");

            return 0;
        }

    }

    boolean isDodge(Fighter foe){

        Random a=new Random();
        int r=a.nextInt(100)+1;

        return r<=this.dodge;
    }

}
