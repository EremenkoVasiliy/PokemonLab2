package pokemons;

import moves.honedge.Tackle;

public class Doublade extends Honedge{

    public Doublade(String name, int level){
        super(name, level);
        super.setStats(59, 110, 150, 45, 49, 35);

        Tackle tackle = new Tackle(40, 100);

        addMove(tackle);

    }

}
