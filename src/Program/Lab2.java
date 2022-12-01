package Program;

import pokemons.*;
import ru.ifmo.se.pokemon.*;



public class Lab2 {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Battle b = new Battle();
        Pawniard pawniard = new Pawniard("Anton", 1);
        Oranguru oranguru = new Oranguru("Edward", 1);
        Bisharp bisharp = new Bisharp("Egor", 1);
        Honedge honedge = new Honedge("Nikita", 1);
        Doublade doublade = new Doublade("Igor", 1);
        AegislashBlade aegislashBlade = new AegislashBlade("Lev", 1);


        b.addAlly(pawniard);
        b.addAlly(doublade);
        b.addAlly(oranguru);

        b.addFoe(honedge);
        b.addFoe(bisharp);
        b.addFoe(aegislashBlade);

        b.go();
    }

    public static boolean chence(double a) {
        return a > Math.random();
    }
}


