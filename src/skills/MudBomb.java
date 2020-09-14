package skills;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, 0.85);
    }

    @Override
    protected String describe() {
        return "использует Mud Bomb";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3)
            p.setMod(Stat.ACCURACY, -1);
    }
}
