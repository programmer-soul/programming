package moves.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 80);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.restore();
    }

    @Override
    protected String describe() {
        return "использует Fury Swipes";
    }
}
