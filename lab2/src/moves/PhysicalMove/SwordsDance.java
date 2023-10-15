package moves.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends PhysicalMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.addEffect(new Effect().stat(Stat.ATTACK, 2));

    }

    @Override
    protected String describe() {
        return "использует Swords Dance";
    }
}
