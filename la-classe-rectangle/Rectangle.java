public class Rectangle {
    private double Longueur;
    private double Largeur;

    // --------------------------------------------------
    // ------------------ constructeur ------------------
    // --------------------------------------------------

    public Rectangle() {

    }

    public Rectangle(double Longueur, double Largeur) {
        this.Longueur = Longueur;
        this.Largeur = Largeur;
    }
    // --------------------------------------------------
    // ----------------- getters setters ----------------
    // --------------------------------------------------

    public double getLongueur() {
        return this.Longueur;
    }

    public void setLongueur(double Longueur) {
        this.Longueur = Longueur;
    }

    public double getLargeur() {
        return this.Largeur;
    }

    public void setLargeur(double Largeur) {
        this.Largeur = Largeur;
    }

    // --------------------------------------------------
    // --------------------- Methods --------------------
    // --------------------------------------------------
    public double Perimetre() {
        return (getLargeur() + getLongueur()) * 2;
    }

    public double Aire() {
        return getLargeur() * getLongueur();
    }

    public boolean EstCarre() {
        return getLargeur() == getLongueur();
    }

    public void AfficherRectangle() {
        System.out.println(toString());
    }
    // --------------------------------------------------
    // --------------------- toString -------------------
    // --------------------------------------------------

    @Override
    public String toString() {
        return "{" +
                " Longueur='" + getLongueur() + "'" +
                ", Largeur='" + getLargeur() + "'" +
                ", Périmètre='" + Perimetre() + "'" +
                ", Aire='" + Aire() + "'" +
                "}";
    }

}
