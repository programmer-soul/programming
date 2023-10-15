package moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.addEffect(new Effect().stat(Stat.ATTACK, -1));

}

    @Override
    protected String describe() {
        return "применяет Confide";
    }
}