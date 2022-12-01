package pokemons;

import moves.pawniard.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pawniard extends Pokemon {

    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public Pawniard(String name, int level){

        super(name, level);
        super.setType(Type.DARK, Type.STEEL);
        super.setStats(45, 85, 70, 40, 40, 60);

        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        Snarl snarl = new Snarl(55, 95);
        AerialAce aerialAce = new AerialAce(60, POSITIVE_INFINITY);

        super.setMove(doubleTeam, snarl, aerialAce);

    }

}
