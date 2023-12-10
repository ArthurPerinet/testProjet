import mesmaths.geometrie.base.Vecteur;

import java.awt.*;

public class BilleNormal extends Bille {

    public BilleNormal(Vecteur centre, double rayon, Vecteur vitesse,
                    Vecteur accélération, Color couleur)
    {
        setPosition(centre);
        setRayon(rayon);
        setVitesse(vitesse);
        setAccélération(accélération);
        setCouleur(couleur);
        setClef();
    }

    /**
     * @param position
     * @param rayon
     * @param vitesse
     * @param couleur
     */
    public BilleNormal(Vecteur position, double rayon, Vecteur vitesse, Color couleur)
    {
        setPosition(position);
        setRayon(rayon);
        setVitesse(vitesse);
        setAccélération(new Vecteur());
        setCouleur(couleur);
        setClef();
    }
}
