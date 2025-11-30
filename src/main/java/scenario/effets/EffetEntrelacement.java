package scenario.effets;

import bandeau.Bandeau;
import scenario.Effet;

public class EffetEntrelacement implements Effet {
    
    private final String message1;
    private final String message2;
    private final int nombreAlternances;
    private final int dureeMessage;
    
    public EffetEntrelacement(String message1, String message2, 
                             int nombreAlternances, int dureeMessage) {
        this.message1 = message1;
        this.message2 = message2;
        this.nombreAlternances = nombreAlternances;
        this.dureeMessage = dureeMessage;
    }

    public EffetEntrelacement(String message1, String message2) {
        this(message1, message2, 5, 300);
    }
    
    @Override
    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i < nombreAlternances; i++) {
            bandeau.setMessage(message1);
            bandeau.sleep(dureeMessage);
            
            bandeau.setMessage(message2);
            bandeau.sleep(dureeMessage);
        }   
        bandeau.setMessage(message1);
        bandeau.sleep(dureeMessage);
    }
}
