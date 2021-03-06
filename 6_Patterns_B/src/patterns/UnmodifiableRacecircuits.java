package patterns;/**
 * @author: Quinten Mortier
 **/

import model.Racecircuit;
import model.Racecircuits;
import model.RacecircuitsInterface;

import java.util.List;
import java.util.TreeSet;
import java.util.logging.Logger;

public class UnmodifiableRacecircuits implements RacecircuitsInterface {
    public static final Logger L = Logger.getLogger(UnmodifiableRacecircuits.class.getName());

    Racecircuits racecircuits;
    public UnmodifiableRacecircuits(Racecircuits racecircuits) {
    this.racecircuits = racecircuits;
    }

    @Override
    public TreeSet<Racecircuit> getCircuits() {
        return racecircuits.getCircuits();
    }

    @Override
    public boolean voegToe(Racecircuit racecircuit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean verwijder(String naam) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Racecircuit zoek(String naam) {
        return racecircuits.zoek(naam);
    }

    @Override
    public int getAantal() {
        return racecircuits.getAantal();
    }

    @Override
    public List<Racecircuit> gesorteerdOpLengte() {
        return racecircuits.gesorteerdOpLengte();
    }

    @Override
    public List<Racecircuit> gesorteerdOpNaam() {
        return racecircuits.gesorteerdOpNaam();
    }

    @Override
    public List<Racecircuit> gesorteerdOpLocatie() {
        return racecircuits.gesorteerdOpLocatie();
    }
}
