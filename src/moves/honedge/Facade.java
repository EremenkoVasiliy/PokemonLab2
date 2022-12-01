package moves.honedge;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected String describe() {
        return "использует Facade";

    }

}
