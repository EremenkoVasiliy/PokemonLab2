package moves.oranguru;

import Program.Lab2;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {

    public Thunderbolt(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if(Lab2.chence(0.1)){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Thunderbolt";
    }

}
