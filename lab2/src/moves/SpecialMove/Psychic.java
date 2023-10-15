package moves.SpecialMove;


import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 0, 0);
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
        return "наносит урон и имеет 10% шанс снизить специальную защиту цели на одну ступень";
    }
}
