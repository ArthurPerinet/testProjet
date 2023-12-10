import mesmaths.cinematique.Cinematique;
import mesmaths.geometrie.base.Geop;
import mesmaths.geometrie.base.Vecteur;

import java.awt.*;
import java.util.Vector;

public abstract class Bille {

    //----------------- classe Bille-------------------------------------

    public  Vecteur position;   // centre de la bille
    public  double rayon;            // rayon > 0
    public Vecteur vitesse;
    public  Vecteur accélération;
    public int clef;                // identifiant unique de cette bille

    private Color couleur;          // rÃ©fÃ©rence awt : mauvais

    private static int prochaineClef = 0;

    public static double ro = 1;        // masse volumique


    protected void setPosition(Vecteur centre)
    {
        this.position=centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void setVitesse(Vecteur vitesse) {
        this.vitesse = vitesse;
    }

    public void setAccélération(Vecteur accélération) {
        this.accélération = accélération;
    }

    public void setClef() {
        this.clef = Bille.prochaineClef ++;;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }


    /**
     * @return the position
     */
    public Vecteur getPosition()
    {
        return this.position;
    }




    /**
     * @return the rayon
     */
    public double getRayon()
    {
        return this.rayon;
    }




    /**
     * @return the vitesse
     */
    public Vecteur getVitesse()
    {
        return this.vitesse;
    }




    /**
     * @return the accélération
     */
    public Vecteur getAccélération()
    {
        return this.accélération;
    }




    /**
     * @return the clef
     */
    public int getKey()
    {
        return this.clef;
    }








    public double masse() {return ro* Geop.volumeSphère(rayon);}



    /**
     * mise Ã  jour de position et vitesse Ã  t+deltaT Ã  partir de position et vitesse Ã  l'instant t
     *
     * modifie le vecteur position et le vecteur vitesse
     *
     * laisse le vecteur accélération intact
     *
     * La bille subit par dÃ©faut un mouvement uniformÃ©ment accÃ©lÃ©rÃ©
     * */
    public  void  déplacer( double deltaT)
    {
        Cinematique.mouvementUniformémentAccéléré( this.getPosition(), this.getVitesse(), this.getAccélération(), deltaT);
    }

    /**
     * calcul (c-Ã -d mise Ã  jour) Ã©ventuel  du vecteur accélération.
     * billes est la liste de toutes les billes en mouvement
     * Cette mÃ©thode peut avoir besoin de "billes" si this subit l'attraction gravitationnelle des autres billes
     * La nature du calcul du vecteur accélération de la bille  est dÃ©finie dans les classes dÃ©rivÃ©es
     * A ce niveau le vecteur accélération est mis Ã  zÃ©ro (c'est Ã  dire pas d'accélération)
     * */
    public  void gestionAccélération(Vector<Bille> billes)
    {

        this.getAccélération().set(Vecteur.VECTEURNUL);
    }

    /**
     * gestion de l'Ã©ventuelle  collision de cette bille avec les autres billes
     *
     * billes est la liste de toutes les billes en mouvement
     *
     * Le comportement par dÃ©faut est le choc parfaitement Ã©lastique (c-Ã -d rebond sans amortissement)
     *
     * @return true si il y a collision et dans ce cas les positions et vecteurs vitesses des 2 billes impliquÃ©es dans le choc sont modifiÃ©es
     * si renvoie false, il n'y a pas de collision et les billes sont laissÃ©es intactes
     * */
    public boolean gestionCollisionBilleBille(Vector<Bille> billes)
    {
        return OutilsBille.gestionCollisionBilleBille(this, billes);
    }




    /** Ã  déplacer dans une classe mieux appropriÃ©e */
    public static void dessineDisque(Graphics g, final Vecteur position, final double rayon, final Color CouleurInférieur, final Color couleurBord)
    {
        int width, height;
        int xMin, yMin;

        xMin = (int)Math.round(position.x-rayon);
        yMin = (int)Math.round(position.y-rayon);

        width = height = 2*(int)Math.round(rayon);

        g.setColor(CouleurInférieur);
        g.fillOval( xMin, yMin, width, height);
        g.setColor(couleurBord);
        g.drawOval(xMin, yMin, width, height);

    }

    /* cette mÃ©thode engendre des clignotements : idÃ©e : utiliser l'active rendering et le double buffering pour Ã©viter Ã§a */

    public void dessine (Graphics g)    // rÃ©fÃ©rence awt : mauvais
    {
        dessineDisque(g,this.getPosition(),this.getRayon(),this.couleur,Color.CYAN);
    }


    public String toString()
    {
        return "centre = " + position + " rayon = "+rayon +  " vitesse = " + vitesse + " accélération = " + accélération + " couleur = " + couleur + "clef = " + clef;
    }

    /**
     * dessine le segment [p1 p2] avec la couleur indiquÃ©e
     *
     *  Ã  déplacer dans une classe mieux appropriÃ©e */

    public static void dessineSegment( Graphics g, Vecteur p1, Vecteur p2, Color couleur)
    {
        int x1 = (int)Math.round(p1.x);
        int y1 = (int)Math.round(p1.y);

        int x2 = (int)Math.round(p2.x);
        int y2 = (int)Math.round(p2.y);

        Color ancienneCouleur = g.getColor();
        g.setColor(couleur);
        g.drawLine(x1, y1, x2, y2);
        g.setColor(ancienneCouleur);
    }

//----------------- classe Bille -------------------------------------
}
