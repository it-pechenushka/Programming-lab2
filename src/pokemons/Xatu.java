package pokemons;

import ru.ifmo.se.pokemon.*;
import skills.*;
public class Xatu extends Natu {

    public Xatu(String name, int lvl){
        super(name, lvl);

        this.setStats(65, 75, 70, 95, 70, 95);
        this.setType(Type.FLYING, Type.PSYCHIC);
        this.setMove(new Facade(), new ThunderWave(), new ShadowBall(), new AirSlash());
    }
}
