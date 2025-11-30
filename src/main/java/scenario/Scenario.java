package scenario;

import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    
    private static class EffetRepete {
        private final Effet effet;
        private final int repetitions;
        
        public EffetRepete(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
        
        public Effet getEffet() {
            return effet;
        }
        
        public int getRepetitions() {
            return repetitions;
        }
    }
    
    private final List<EffetRepete> effets;
    
    public Scenario() {
        this.effets = new ArrayList<>();
    }
    
    public void ajouter(Effet effet, int repetitions) {
        if (repetitions < 1) {
            throw new IllegalArgumentException("Le nombre de répétitions doit être au moins 1");
        }
        effets.add(new EffetRepete(effet, repetitions));
    }

    public void ajouter(Effet effet) {
        ajouter(effet, 1);
    }
    
    public void jouer(Bandeau bandeau) {
        for (EffetRepete effetRepete : effets) {
            for (int i = 0; i < effetRepete.getRepetitions(); i++) {
                effetRepete.getEffet().appliquer(bandeau);
            }
        }
    }
    
    public int getNombreEffets() {
        return effets.size();
    }
}
