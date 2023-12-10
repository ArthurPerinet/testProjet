import mesmaths.geometrie.base.Vecteur;

import java.util.Vector;

public class Newton extends DecorateurAcceleration{

    public Newton(Bille b)
    {
        super(b);
    }

    public void gestionAccélération(Vector<Bille> billes)
    {

        this.billeDecore.getAccélération().ajoute(OutilsBille.gestionAccélérationNewton(this, billes));     // contribution de l'accélération due à l'attraction des autres billes

    }

    public String toString()
    {
        return this.billeDecore.toString()+" Acceleration = Newton ";
    }
}
