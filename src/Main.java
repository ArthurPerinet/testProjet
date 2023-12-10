import mesmaths.geometrie.base.Vecteur;

import java.awt.*;

// Classe principale de l'application.
public class Main
{
    // Méthode principale.
    public static void main(String[] args)
    {
        Bille billes[] = new Bille[6];

        double xMax, yMax;
        double vMax = 0.1;
        xMax = 800;     // abscisse maximal
        yMax = 800;      // ordonnée maximale

        double rayon = 0.05*Math.min(xMax, yMax); // rayon des billes : ici toutes les billes ont le même rayon, mais ce n'est pas obligatoire

        Vecteur p0, p1, p2, p3, p4, p5,  v0, v1, v2, v3, v4, v5;    // les positions des centres des billes et les vecteurs vitesse au démarrage.


        p0 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
        p1 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
        p2 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
        p3 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
        p4 = Vecteur.créationAléatoire(0, 0, xMax, yMax);
        p5 = Vecteur.créationAléatoire(0, 0, xMax, yMax);

//------------------- création des vecteurs vitesse des billes ---------------------------------

        v0 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
        v1 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, 0);
        v2 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
        v3 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
        v4 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);
        v5 = Vecteur.créationAléatoire(-vMax, -vMax, vMax, vMax);






        billes[0] = new BilleNormal(p0, rayon, v0, Color.red);

        billes[1] = new BilleNormal(p1, rayon, v1, Color.black);

        billes[2] = new PasseMuraille( new BilleNormal(p2, rayon, v2, Color.yellow));

        billes[3] = new Arret(new Rebond(new BilleNormal(p3, rayon, v3, Color.orange)));

        billes[4] = new Rebond( new BilleNormal(p4, rayon, v4, Color.orange));

        billes[5] = new Frottement(new BilleNormal(p5,rayon,v5,Color.CYAN));

        int i;
        System.out.println(" les clients sont : ");
        //for ( i = 0; i < billes.length; ++i)
            //System.out.println(billes[i].getAccélération());


        Frottement b1= new Frottement( new BilleNormal(p2, rayon, v2, Color.yellow));
        System.out.println(b1.getAccélération());
        System.out.println(b1.getVitesse());
    }
}