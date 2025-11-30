package scenario.effets;

import bandeau.Bandeau;
import scenario.Effet;
import java.awt.Color;

public class EffetDegradeCouleur implements Effet {
    
    private final String message;
    
    private final Color couleurDepart;
    
    private final Color couleurArrivee;
    
    private final int nombreEtapes;
    
    private final int dureeEtape;

    public EffetDegradeCouleur(String message, Color couleurDepart, Color couleurArrivee, 
                               int nombreEtapes, int dureeEtape) {
        this.message = message;
        this.couleurDepart = couleurDepart;
        this.couleurArrivee = couleurArrivee;
        this.nombreEtapes = nombreEtapes;
        this.dureeEtape = dureeEtape;
    }

    public EffetDegradeCouleur(String message) {
        this(message, Color.RED, Color.BLUE, 20, 100);
    }
    
    @Override
    public void appliquer(Bandeau bandeau) {
        Color couleurOriginale = bandeau.getForeground();
        bandeau.setMessage(message);
        
        // Extraire les composantes RGB
        int rDepart = couleurDepart.getRed();
        int gDepart = couleurDepart.getGreen();
        int bDepart = couleurDepart.getBlue();
        
        int rArrivee = couleurArrivee.getRed();
        int gArrivee = couleurArrivee.getGreen();
        int bArrivee = couleurArrivee.getBlue();
        
        // interpolation
        for (int i = 0; i <= nombreEtapes; i++) {
            double ratio = (double) i / nombreEtapes;
            
            int r = (int) (rDepart + (rArrivee - rDepart) * ratio);
            int g = (int) (gDepart + (gArrivee - gDepart) * ratio);
            int b = (int) (bDepart + (bArrivee - bDepart) * ratio);
            
            Color couleurIntermediaire = new Color(r, g, b);
            bandeau.setForeground(couleurIntermediaire);
            bandeau.sleep(dureeEtape);
        }
        
        bandeau.setForeground(couleurOriginale);
    }
}
