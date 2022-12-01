package moves.oranguru;


import Program.Lab2;
import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
    public Confusion(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if(Lab2.chence(0.1)){
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Confusion";
    }

}
