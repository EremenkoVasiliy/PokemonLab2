package moves.oranguru;

import Program.Lab2;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {

    public Bulldoze(double pow, double acc){
        super(Type.GROUND, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);

    }

    @Override
    protected String describe() {
        return "использует Bulldoze";

    }

}

