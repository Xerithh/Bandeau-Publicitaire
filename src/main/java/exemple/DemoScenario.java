package exemple;

import bandeau.Bandeau;
import scenario.Scenario;
import scenario.effets.*;

public class DemoScenario {
    
    public static void main(String[] args) {
        new DemoScenario().demoAnimation();
    }

    public void demoAnimation() {
        Bandeau bandeau = new Bandeau();
        Scenario scenario = new Scenario();

        scenario.ajouter(new EffetDegradeCouleur("DÉGRADÉ COULEUR", 
                                                  new java.awt.Color(255, 0, 0), 
                                                  new java.awt.Color(0, 0, 255), 
                                                  20, 80), 1);
        
        scenario.ajouter(new EffetPuissance("PUISSANCE", 12, 45, 2, 60, "Arial"), 2);
        
        scenario.ajouter(new EffetEntrelacement("* OFFRE *", "SPÉCIALE !", 4, 250), 1);
        
        scenario.jouer(bandeau);
        
        bandeau.setMessage("FIN");
        bandeau.sleep(2000);
        bandeau.close();
    }
}
