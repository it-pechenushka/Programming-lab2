package pokemons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Blissey extends Chansey{
    public Blissey(String name, int lvl){
        super(name, lvl);

        this.setStats(255, 10, 10, 75, 135, 55);
        this.setType(Type.NORMAL);
        this.setMove(new Pound(), new DoubleTeam(), new MudBomb(), new ShadowBall());
    }
}
