import mesmaths.geometrie.base.Vecteur;
import mesmaths.mecanique.MecaniquePoint;

import java.util.Vector;

public class Frottement extends DecorateurAcceleration{

    public Frottement(Bille b)
    {
        super(b);
        
    }

    public void gestionAccélération(Vector<Bille> billes)
    {

         this.getAccélération().ajoute(MecaniquePoint.freinageFrottement(this.masse(), this.getVitesse())); // contribution de l'accélération due au frottement dans l'air


    }

    public String toString()
    {
        return this.billeDecore.toString()+" Acceleration = Frottement ";
    }
}
