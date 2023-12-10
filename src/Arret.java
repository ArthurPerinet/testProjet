import mesmaths.cinematique.Collisions;

public class Arret extends DecorateurCollision{

    public Arret(Bille b)
    {
        super(b);
    }

    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinGauche, double largeur, double hauteur)
    {
        Collisions.collisionBilleContourAvecArretHorizontal(this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, largeur);
        Collisions.collisionBilleContourAvecArretVertical(this.getPosition(), this.getRayon(), this.getVitesse(), ordonnéeCoinGauche, hauteur);

    }

    public String toString()
    {
        return this.billeDecore.toString()+" Collision = Arret";
    }
}
