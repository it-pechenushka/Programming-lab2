package pokemons;

import ru.ifmo.se.pokemon.*;
import skills.*;
public class Natu extends Pokemon {

    public Natu(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.PSYCHIC, Type.FLYING);
        this.setStats(40, 50, 45, 70, 45, 70);
        this.setMove(new Facade(), new ShadowBall(), new ThunderWave());
    }
}