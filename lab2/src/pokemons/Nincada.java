package pokemons;



import moves.PhysicalMove.FurySwipes;
import moves.PhysicalMove.SwordsDance;
import moves.StatusMove.Rest;
import moves.StatusMove.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nincada extends Pokemon {
    public Nincada(String name, int level) {
        super(name,level);
        setStats(31,45,90,30, 30, 40);
        setType(Type.BUG, Type.GROUND);
        setMove(new SandAttack(), new Rest(), new FurySwipes(), new SwordsDance());
    }
}
