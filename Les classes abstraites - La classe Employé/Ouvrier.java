import java.util.Date;

public class Ouvrier extends Employe {

    private Date date_embauche;

    // --------------- constructeur ---------------
    // --------------------------------------------

    public Ouvrier() {
    }

    public Ouvrier(int matricule, String nom, String prenom, Date date_naissance, Date date_embauche) {
        super(matricule, nom, prenom, date_naissance);
        this.date_embauche = date_embauche;
    }

    // -------------- Getters Setters --------------
    // ---------------------------------------------

    public Date getDate_embauche() {
        return this.date_embauche;
    }

    public void setDate_embauche(Date date_embauche) {
        this.date_embauche = date_embauche;
    }

    // -------------- Methods ----------------------
    // ---------------------------------------------
    public double GetSalaire() {
        double salaire = 2500.0;
        salaire += (new Date().getYear() - getDate_embauche().getYear()) * 100;
        if (salaire > 5000) {
            return 5000.0;
        }
        return salaire;
    }

    // -------------- toString ----------------------
    // ----------------------------------------------

    @Override
    public String toString() {
        return "{" +
                " date_embauche='" + getDate_embauche() + "', " +
                super.toString();
    }

}
