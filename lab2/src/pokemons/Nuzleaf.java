package pokemons;

import moves.SpecialMove.ShadowBall;
import moves.StatusMove.Confide;
import moves.StatusMove.Harden;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nuzleaf extends Pokemon {
    public Nuzleaf(String name, int level) {
        super(name,level);
        setStats(70,70,40,60, 40, 60);
        setType(Type.GRASS, Type.DARK);
        setMove(new ShadowBall(), new Confide(), new Harden());
    }
}
