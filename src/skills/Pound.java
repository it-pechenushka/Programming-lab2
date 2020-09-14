package skills;

import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove{
    public Pound(){
        super(Type.NORMAL, 40, 1);
    }

    @Override
    protected String describe() {
        return "использует Pound";
    }
}