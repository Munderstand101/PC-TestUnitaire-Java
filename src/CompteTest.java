import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompteTest {

    private Compte unCompte;

    @Before
    public void setUp(){
        Compte.setDernierNumero(0);
        this.unCompte = new Compte();
        //unCompte.afficher();
    }

    @Test
    public void testCompteNotNull(){
        assertNotNull("L'objet Compte n'a pas été correctement créé.", this.unCompte ==null);
    }

    @Test
    public void testCompteInitialisation(){
        int num = this.unCompte.getNumCompte();
        assertTrue("Le numCompte n'a pas ete initialiser correctement", num==1);

        int dnum = this.unCompte.getDernierNumero();
        assertTrue("Le dernierNumero n'a pas ete initialiser correctement", dnum==1);

        double solde = this.unCompte.getSolde();
        assertTrue("Le solde n'a pas ete initialiser correctement", solde==0);
    }

    @Test
    public void testCrediter(){
        assertTrue("Le solde n'a pas ete initialiser correctement", this.unCompte.getSolde()==0);
        this.unCompte.crediterSolde(50);
        assertTrue("Le solde n'a pas ete initialiser correctement", this.unCompte.getSolde()==50);
    }

    @Test
    public void testDebiter(){
        assertTrue("Le solde n'a pas ete initialiser correctement", this.unCompte.getSolde()==0);

    }

    @Test
    public void testGetNumeroCompte(){
        int num = this.unCompte.getNumCompte();
        assertTrue("Le numCompte n'a pas ete initialiser correctement", num==1);
    }

    @Test
    public void testGetNumeroCompteBis(){
        for (int i = 0; i>10; i++){
            this.unCompte = new Compte();
            int num = this.unCompte.getNumCompte();
            assertTrue("Le numCompte n'a pas ete initialiser correctement", num==i+1);
        }

    }

    @Test
    public void testSetNumeroCompte(){
        assertTrue("Le NumCompte n'a pas ete initialiser correctement", this.unCompte.getNumCompte()==1);

        this.unCompte.setNumCompte (5);
        assertTrue("Le NumCompte n'a pas ete modifier correctement", this.unCompte.getNumCompte()==5);
    }

    @Test
    public void testSetNumeroCompteBis(){
        for (int i = 0; i>10; i++){
            this.unCompte.setNumCompte (i);
            assertTrue("Le numCompte n'a pas ete initialiser correctement", this.unCompte.getNumCompte()==i);
        }
    }

    @Test
    public void testGetDernierNumero(){
        int num = this.unCompte.getNumCompte();
        assertTrue("Le numCompte n'a pas ete initialiser correctement", num==1);
    }

    @Test
    public void testSetDernierNumero(){
        assertTrue("Le DernierNumero n'a pas ete initialiser correctement", this.unCompte.getDernierNumero()==1);

        this.unCompte.setDernierNumero (5);
        assertTrue("Le DernierNumero n'a pas ete modifier correctement", this.unCompte.getDernierNumero()==5);
    }

}