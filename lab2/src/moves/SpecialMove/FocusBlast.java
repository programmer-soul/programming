package moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Math.random() < 0.1) {
            Effect e = new Effect().stat(Stat.DEFENSE, -1);
            p.addEffect(e);
        }
    }
    @Override
    protected String describe() {
        return "наносит урон и с вероятностью 10% снижает специальную защиту цели на одну ступень.";
    }
}
