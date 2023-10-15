
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {
        Battle game = new Battle();
        Zekrom zekrom = new Zekrom("Coconut", 1);
        Nincada nincada = new Nincada("Killer", 1);
        Ninjask ninjask = new Ninjask("Car", 1);
        Seedot seedot = new Seedot("Door", 1);
        Nuzleaf nuzleaf = new Nuzleaf("Tsss", 1);
        Shiftry shiftry = new Shiftry("Boy", 1);
        game.addAlly(zekrom);
        game.addAlly(nincada);
        game.addAlly(ninjask);
        game.addFoe(seedot);
        game.addFoe(nuzleaf);
        game.addFoe(shiftry);

        game.go();
    }

}