import java.lang.Math;

public class Point {

    private double abscisse;
    private double ordonnee;
    //consctructeur
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }
    //afficher le point
    public void afficherCoord() {
        System.out.println("L'abscisse du point est " + this.abscisse +
                " et l'ordonne du point est "+ this.ordonnee);
    }
    //deplacer un point
    public void deplacerPoint(double dx, double dy) {
        this.abscisse = dx;
        this.ordonnee = dy;
    }

    //calcul de distance
    public double calculDistance(Point unPoint) {
        double  resultat = 0.0;
        resultat = Math.sqrt(
                Math.pow(2,unPoint.getAbscisse()-this.abscisse)+
                Math.pow(2,unPoint.getOrdonnee()-this.ordonnee)
        );
        return resultat;
    }

    //getters and setters
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
}
