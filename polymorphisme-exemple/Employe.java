public class Employe extends Personne {
    private double Salaire;

    // ---------- constructeur ----------
    public Employe() {
        super();
    }

    public Employe(String nom, String prenom, String date_naissance, double Salaire) {
        super(nom, prenom, date_naissance);
        this.Salaire = Salaire;
    }
    // ---------- getters setters ----------

    public double getSalaire() {
        return this.Salaire;
    }

    public void setSalaire(double Salaire) {
        this.Salaire = Salaire;
    }

    // ---------- toString ----------

    @Override
    public String toString() {
        return super.toString() + " Salaire='" + getSalaire() + "'";
    }

}
