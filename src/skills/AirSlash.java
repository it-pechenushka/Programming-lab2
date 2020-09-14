package skills;

import ru.ifmo.se.pokemon.*;

public class AirSlash extends SpecialMove{
    public AirSlash(){
        super(Type.FLYING, 75, 0.95);
    }

    @Override
    protected String describe() {
        return "БОГОПОДОБЕН. НУ ТОГДА AIR SLASH";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.3)
            Effect.flinch(p);
    }
}