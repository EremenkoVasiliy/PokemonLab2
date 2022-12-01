package moves.honedge;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.ATTACK, 2);

        Effect.confuse(p);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        return "использует Swagger";

    }

}
