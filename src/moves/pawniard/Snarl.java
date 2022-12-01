package moves.pawniard;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl(double pow, double acc){
        super(Type.DARK, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);

        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Snarl";

    }

}
