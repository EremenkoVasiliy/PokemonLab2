package pokemons;

import moves.honedge.Swagger;

public class AegislashBlade extends Doublade{
    public AegislashBlade(String name, int level){
        super(name, level);
        super.setStats(60, 50, 140, 50, 140, 60);

        Swagger swagger = new Swagger(0, 85);

        addMove(swagger);

    }

}
