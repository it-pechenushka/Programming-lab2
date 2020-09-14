package skills;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "решает использовать Double Team для выживаемости";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }
}
