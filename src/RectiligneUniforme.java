import mesmaths.geometrie.base.Vecteur;

import java.util.Vector;

public class RectiligneUniforme extends DecorateurAcceleration {

    public RectiligneUniforme (Bille b)
    {
        super(b);
    }

    public void gestionAccélération(Vector<Bille> billes)
    {
        this.getAccélération().set(Vecteur.VECTEURNUL);
    }

    public String toString()
    {
        return this.billeDecore.toString()+" Acceleration = Rectiligne Uniforme ";
    }
}
