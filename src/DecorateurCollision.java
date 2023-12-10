public abstract class DecorateurCollision extends Bille {


    protected Bille billeDecore;

    public DecorateurCollision(Bille billeDecore)
    {
        this.billeDecore = billeDecore;
    }


    /**
     * gestion de l'Ã©ventuelle collision de la bille (this) avec le contour rectangulaire de l'Ã©cran dÃ©fini par (abscisseCoinHautGauche, ordonnéeCoinGauche, largeur, hauteur)
     *
     * dÃ©tecte si il y a collision et le cas Ã©chÃ©ant met Ã  jour position et vitesse
     *
     * La nature du comportement de la bille en rÃ©ponse Ã  cette collision est dÃ©finie dans les classes dÃ©rivÃ©es
     * */
    public abstract void collisionContour(double abscisseCoinHautGauche, double ordonnéeCoinGauche, double largeur, double hauteur);





}
