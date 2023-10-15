package moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 18, 80, 0, (int)(Math.ceil(Math.random()*(2-5)+2)));
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.restore();
        super.applySelfEffects(p);
    }
    @Override
    protected String describe() {
        return "применяет Rest";
    }
}