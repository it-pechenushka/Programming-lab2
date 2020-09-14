package skills;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall(){
        super(Type.GHOST, 80, 1);
    }

    @Override
    protected String describe() {
        return "считает, что настало время использовать Shadow Ball!!!";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.2)
            p.addEffect(new Effect().chance(0.25).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}