package pokemons;

import moves.oranguru.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oranguru extends Pokemon {

    public Oranguru(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.PSYCHIC);
        super.setStats(90, 60, 80, 90, 110,60);

        Confusion confusion = new Confusion(50, 100);
        Thunder thunder = new Thunder(110, 70);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        Thunderbolt thunderbolt = new Thunderbolt(90, 100);

        super.setMove(confusion, thunder, bulldoze, thunderbolt);

    }

}
