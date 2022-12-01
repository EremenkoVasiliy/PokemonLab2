package moves.pawniard;

import Program.Lab2;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(double pow, double acc){
        super(Type.FLYING, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        if(Lab2.chence(0.1)){
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "использует Focus Blast";
    }

}
