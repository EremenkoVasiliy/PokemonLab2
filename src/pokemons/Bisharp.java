package pokemons;

import moves.pawniard.FocusBlast;

public class Bisharp extends Pawniard {
    public Bisharp (String name, int level){
        super(name, level);
        super.setStats(65, 125, 100, 60, 70, 70);

        FocusBlast focusBlast = new FocusBlast(120, 70);

        addMove(focusBlast);

    }

}
