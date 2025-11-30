package scenario.effets;

import bandeau.Bandeau;
import scenario.Effet;
import java.awt.Font;

public class EffetPuissance implements Effet {
    
    private final String message;
    
    private final int tailleMin;
    
    private final int tailleMax;
    
    private final int nombrePulsations;
    
    private final int dureeEtape;
    
    private final String nomPolice;

    public EffetPuissance(String message, int tailleMin, int tailleMax, 
                         int nombrePulsations, int dureeEtape, String nomPolice) {
        this.message = message;
        this.tailleMin = tailleMin;
        this.tailleMax = tailleMax;
        this.nombrePulsations = nombrePulsations;
        this.dureeEtape = dureeEtape;
        this.nomPolice = nomPolice;
    }

    public EffetPuissance(String message) {
        this(message, 15, 40, 1, 50, "Arial");
    }
    
    @Override
    public void appliquer(Bandeau bandeau) {
        Font policeOriginale = bandeau.getFont();
        bandeau.setMessage(message);
        
        int plage = tailleMax - tailleMin;
        
        for (int p = 0; p < nombrePulsations; p++) {
            // tailleMin à tailleMax
            for (int i = 0; i <= plage; i++) {
                int taille = tailleMin + i;
                bandeau.setFont(new Font(nomPolice, Font.BOLD, taille));
                bandeau.sleep(dureeEtape);
            }
            
            // tailleMax à tailleMin
            for (int i = plage; i >= 0; i--) {
                int taille = tailleMin + i;
                bandeau.setFont(new Font(nomPolice, Font.BOLD, taille));
                bandeau.sleep(dureeEtape);
            }
        }
        
        bandeau.setFont(policeOriginale);
    }
}
