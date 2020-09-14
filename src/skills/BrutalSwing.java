package skills;

import ru.ifmo.se.pokemon.*;


public class BrutalSwing extends PhysicalMove {
    public BrutalSwing(){
        super(Type.DARK, 60, 1);
    }

    @Override
    protected String describe(){
        return "размахивает своим телом и наносит урон всему, что находится поблизости";
    }
}