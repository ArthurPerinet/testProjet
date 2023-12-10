import mesmaths.cinematique.Collisions;

public class Rebond extends DecorateurCollision{

    public Rebond(Bille b)
    {
        super(b);
    }

    public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinGauche, double largeur, double hauteur)
    {
        Collisions.collisionBilleContourAvecRebond( this.getPosition(), this.getRayon(), this.getVitesse(), abscisseCoinHautGauche, ordonnéeCoinGauche, largeur, hauteur);

    }

    public String toString()
    {
        return this.billeDecore.toString()+" Collision = Rebond";
    }
}
