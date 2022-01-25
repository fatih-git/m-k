import java.util.Random;

public class Match {

    Fighter f1;
    Fighter f2;
    int minweight;
    int maxweight;

    Match(Fighter f1, Fighter f2, int minweight, int maxweight){

        this.f1=f1;
        this.f2=f2;
        this.maxweight=maxweight;
        this.minweight=minweight;

    }

    void run(){

        Random a=new Random();
        int r=a.nextInt(2)+1;

        if (isCheck()){

            while(this.f1.health>0 && this.f2.health>0){

                System.out.println("\n=======YENİ ROUND=======");

                if (r==1) {

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name+" oyuncusunun canı: "+this.f2.health);

                }
                else if (r==2) {

                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name+" oyuncusunun canı: "+this.f1.health);

                }

                r=a.nextInt(2)+1;

            }

            if (this.f1.health==0)
                System.out.println("Kazanan: "+this.f2.name);
            else
                System.out.println("Kazanan: "+this.f1.name);

        }
        else
            System.out.println("Sikletler uymuyor!");

    }

    boolean isCheck(){
        return (this.f1.weight>=minweight && this.f1.weight<=maxweight)&&(this.f2.weight>=minweight && this.f2.weight<=maxweight);
    }

}
