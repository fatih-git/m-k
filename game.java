/**
 * @author fatih-git
 * */

public class game {

    public static void main(String[] args) {

        Fighter f1=new Fighter("Fatih", 10, 130, 120, 40);
        Fighter f2=new Fighter("Ümit", 6, 100, 90, 60);

        Match match=new Match(f1, f2, 80, 140);
        match.run();



    }

}
