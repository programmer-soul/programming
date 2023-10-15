package pokemons;

import moves.SpecialMove.ShadowBall;
import moves.StatusMove.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seedot extends Pokemon {
    public Seedot(String name, int level) {
        super(name,level);
        setStats(40,40,50,30, 30, 30);
        setType(Type.GRASS);
        setMove(new ShadowBall(), new Confide());
    }
}
