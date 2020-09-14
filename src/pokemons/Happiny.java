package pokemons;

import ru.ifmo.se.pokemon.*;
import skills.*;
public class Happiny extends Pokemon{

    public Happiny(String name, int lvl){
        super(name, lvl);

        this.setStats(100, 5, 5, 15, 65, 30);
        this.setType(Type.NORMAL);
        this.setMove(new Pound(), new DoubleTeam());
    }
}
