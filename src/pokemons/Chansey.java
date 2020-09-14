package pokemons;

import ru.ifmo.se.pokemon.*;
import skills.*;
public class Chansey extends Happiny {

    public Chansey(String name, int lvl){
        super(name, lvl);

        this.setStats(250, 5, 5, 35, 105, 50);
        this.setType(Type.NORMAL);
        this.setMove(new Pound(), new DoubleTeam(), new MudBomb());
    }
}