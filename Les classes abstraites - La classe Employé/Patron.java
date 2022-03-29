import java.util.Date;

public class Patron extends Employe {
    private int pourcentage;
    private double CA;

    // --------------- constructeur ---------------
    // --------------------------------------------

    public Patron() {
    }

    public Patron(int matricule, String nom, String prenom, Date date_naissance, int pourcentage, double CA) {
        super(matricule, nom, prenom, date_naissance);
        this.pourcentage = pourcentage;
        this.CA = CA;
    }

    // -------------- Getters Setters --------------
    // ---------------------------------------------

    public int getPourcentage() {
        return this.pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public double getCA() {
        return this.CA;
    }

    public void setCA(double CA) {
        this.CA = CA;
    }

    // -------------- Methods ----------------------
    // ---------------------------------------------
    public double GetSalaire() {
        return (getCA() * ( (double) getPourcentage() / 100));
    }

    // -------------- toString ----------------------
    // ----------------------------------------------
    @Override
    public String toString() {
        return "{" +
                " Pourcentage='" + getPourcentage() + "'" + super.toString();
    }

}
