package pokemons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Deoxys extends Pokemon {

    public Deoxys(String name, int lvl) {
        super(name, lvl);

        this.setType(Type.PSYCHIC);
        this.setStats(50, 150, 50, 150, 50, 150);
        this.setMove(new Thunder(), new BrutalSwing(), new PoisonJab(), new ThunderWave());
    }
}
