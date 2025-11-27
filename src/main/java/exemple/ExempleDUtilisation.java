package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau bandeau1 = new Bandeau();
        Bandeau bandeau2 = new Bandeau();

        Font font = bandeau1.getFont();
        Color back = bandeau1.getBackground();
        Color fore = bandeau1.getForeground();

        bandeau1.setMessage("Hello");
        bandeau1.sleep(1000);
        bandeau1.setMessage("On va changer de police");
        bandeau1.sleep(1000);
        bandeau1.setMessage("Monospaced 15 Bold");
        bandeau1.setFont(new Font("Monospaced", Font.BOLD, 15));
        bandeau1.sleep(1000);
        bandeau1.setMessage("SansSerif 15");
        bandeau1.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bandeau1.sleep(1000);
        // Bandeau 2
        bandeau2.setMessage("On va zoomer");
        bandeau2.sleep(1000);
        bandeau2.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            bandeau2.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau2.sleep(100);
        }
        bandeau2.sleep(1000);
        // Bandeau 1
        bandeau1.setFont(new Font("Courier new", Font.PLAIN, 15));
        bandeau1.setMessage("On va tourner");
        bandeau1.sleep(1000);
        bandeau1.setMessage("On tourne de 45°...");
        bandeau1.setRotation(Math.PI / 2.0f);
        bandeau1.sleep(1000);
        bandeau1.setRotation(0.0f);

        bandeau1.setMessage("On va changer de couleur de fond");
        bandeau1.sleep(1000);
        bandeau1.setBackground(Color.DARK_GRAY);
        bandeau1.setMessage("On va changer de couleur");
        bandeau1.sleep(1000);
        bandeau1.setForeground(Color.YELLOW);
        bandeau1.sleep(1000);
        bandeau1.setFont(font);
        bandeau1.setForeground(fore);
        bandeau1.setBackground(back);
        bandeau1.setMessage("Terminé");
        bandeau1.sleep(3000);
        bandeau1.close();
        bandeau2.close();
    }
}
