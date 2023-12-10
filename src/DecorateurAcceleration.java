import java.util.Vector;

public abstract class DecorateurAcceleration extends Bille{

    protected Bille billeDecore;

    public DecorateurAcceleration(Bille billeDecore)
    {
        this.billeDecore = billeDecore;
    }

    public abstract void gestionAccélération(Vector<Bille> billes);


}
