import mesmaths.geometrie.base.Vecteur;
import mesmaths.mecanique.MecaniquePoint;

import java.util.Vector;

public class Pesanteur extends DecorateurAcceleration{

    Vecteur pesanteur;

    public Pesanteur(Bille b, Vecteur pesanteur)
    {
        super(b);
        this.pesanteur = pesanteur;
    }

    public void gestionAccélération(Vector<Bille> billes)
    {

        this.getAccélération().ajoute(this.pesanteur);          // contribution du champ de pesanteur (par exemple)

    }

    public String toString()
    {
        return this.billeDecore.toString()+" Acceleration = Pesanteur ";
    }
}
