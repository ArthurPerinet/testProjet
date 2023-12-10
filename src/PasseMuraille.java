import mesmaths.cinematique.Collisions;

import java.util.Vector;

public class PasseMuraille extends DecorateurCollision{

    public PasseMuraille(Bille b)
    {
        super(b);
    }

   public void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinGauche, double largeur, double hauteur)
   {
       Collisions.collisionBilleContourPasseMuraille( this.getPosition(), abscisseCoinHautGauche, ordonnéeCoinGauche, largeur, hauteur);

   }

    public String toString()
    {
        return this.billeDecore.toString()+" Collision = PasseMuraille";
    }

}
