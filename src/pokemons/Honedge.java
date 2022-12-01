package pokemons;

import moves.honedge.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Honedge extends Pokemon {

    public Honedge(String name, int level){

        super(name, level);
        super.setType(Type.STEEL, Type.GHOST);
        super.setStats(45, 80, 100, 35, 37, 28);

        Facade facade = new Facade(70, 100);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);

        setMove(facade, shadowClaw);

    }
}
