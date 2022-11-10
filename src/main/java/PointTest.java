import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    private Point unPoint;

    @Before
    public void setUp() throws Exception {
        this.unPoint=new Point(4,8);
    }

    @Test
    public void testPointNotNul() {
        assertNotNull("Le constructeur n' a pas creer l'objet point", this.unPoint);
    }


    @Test
    public void testPointInitialisation() {
        assertTrue("Le constructeur n' a pas initialise correctement l'attribut abscisse ", this.unPoint.getAbscisse()==4);
        assertTrue("Le constructeur n' a pas initialise correctement l'attribut Ordonnee ", this.unPoint.getOrdonnee()==8);
    }

    @Test
    public void deplacerPoint() {
        this.unPoint.deplacerPoint(5, 9);

        assertTrue("Abscisse pas mis a jour", this.unPoint.getAbscisse()==5);
        assertTrue("Ordonnee pas mis a jour ", this.unPoint.getOrdonnee()==9);
    }

    @Test
    public void calculDistance() {
        Point unPoint2 = new Point(6,7);

        //Appel de la méthode à tester sur l'objet de test
        double distance = this.unPoint.calculDistance(unPoint2);

        //Assertion/vérification
        assertTrue("La methode n'as pas ete calculer corectement la distance entre les 2 points", distance==Math.sqrt(Math.pow(4-6,2)+ Math.pow(8-7,2)));
    }

    @Test
    public void getAbscisse() {
        double val = this.unPoint.getAbscisse();
        assertTrue("Le getteur de l'Abscisse n'as pas retourner la bonne valeur", val==4 );
    }

    @Test
    public void setAbscisse() {
        //Appel de la méthode à tester
        this.unPoint.setAbscisse(5);

        //Assertion/vérification
        assertTrue("Le setter n'as pas mis a jour correctement l'abscisse du point", this.unPoint.getAbscisse()==5);
    }

    @Test
    public void getOrdonnee() {
        double val = this.unPoint.getOrdonnee();
        assertTrue("Le getteur de l'Ordonnee n'as pas retourner la bonne valeur", val==8 );
    }

    @Test
    public void setOrdonnee() {
        //Appel de la méthode à tester
        this.unPoint.setOrdonnee(5);

        //Assertion/vérification
        assertTrue("Le setter n'as pas mis a jour correctement l'Ordonnee du point", this.unPoint.getOrdonnee()==5);
    }
}