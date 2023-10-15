package pokemons;

import moves.SpecialMove.ShadowBall;
import moves.StatusMove.Confide;
import moves.StatusMove.DoubleTeam;
import moves.StatusMove.Harden;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shiftry extends Pokemon {
    public Shiftry(String name, int level) {
        super(name,level);
        setStats(90,100,60,90, 60, 80);
        setType(Type.GRASS, Type.DARK);
        setMove(new ShadowBall(), new Confide(), new Harden(), new DoubleTeam());
    }
}
