package pokemons;

import moves.PhysicalMove.BrutalSwing;
import moves.SpecialMove.FocusBlast;
import moves.SpecialMove.Psychic;
import moves.StatusMove.Roost;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zekrom extends Pokemon {
    public Zekrom(String name, int level) {
        super(name,level);
        setStats(100,150,120,120, 100, 90);
        setType(Type.DRAGON, Type.ELECTRIC);
        setMove(new BrutalSwing(), new Roost(), new Psychic(), new FocusBlast());
    }
}
