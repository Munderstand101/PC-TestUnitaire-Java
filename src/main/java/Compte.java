public class Compte {

    private int numCompte;
    private double solde;
    private static int dernierNumero = 0;

    public Compte() {
        this.solde = 0;
        this.numCompte = dernierNumero+1;
        dernierNumero++;
    }


    public void crediterSolde(double montant)
    {
        solde+=montant;
    }

    public void debiterSolde(double montant)
    {
        solde-=montant;
    }

    public double getSolde() {
        return solde;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public static int getDernierNumero() {
        return dernierNumero;
    }

    public static void setDernierNumero(int dernierNumerop) {
        dernierNumero = dernierNumerop;
    }

    public void afficher() {
        System.out.println(" ------- Compte : --------- ");
        System.out.println("Numero Compte  : " + this.numCompte);
        System.out.println("Solde : " + this.solde);

        System.out.println(" ------------------------- ");
        System.out.println(" ");
    }

}