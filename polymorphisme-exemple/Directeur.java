public class Directeur extends Chef {
    private String societe;

    // ---------- constructeur ----------
    public Directeur() {
        super();
    }

    public Directeur(String nom, String prenom, String date_naissance, double Salaire, String service, String societe) {
        super(nom, prenom, date_naissance, Salaire, service);
        this.societe = societe;
    }

    // ---------- getters setters ----------

    public String getSociete() {
        return this.societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    // ---------- toString ----------

    @Override
    public String toString() {
        return super.toString() + " societe='" + getSociete() + "'";
    }

}
