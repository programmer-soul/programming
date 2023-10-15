package pokemons;

import moves.PhysicalMove.FurySwipes;
import moves.StatusMove.Rest;
import moves.StatusMove.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Ninjask extends Pokemon {
    public Ninjask(String name, int level) {
        super(name,level);
        setStats(61,90,45,50, 50, 160);
        setType(Type.BUG, Type.FLYING);
        setMove(new SandAttack(), new Rest(), new FurySwipes());
    }
}

