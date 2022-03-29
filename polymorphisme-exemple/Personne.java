public class Personne {
    private String nom;
    private String prenom;
    private String date_naissance;

    // ---------- constructeur ----------
    public Personne() {

    }

    public Personne(String nom, String prenom, String date_naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
    }

    // ---------- getters setters ----------

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    // ---------- toString ----------

    @Override
    public String toString() {
        return " nom='" + getNom() + "'" +
                ", prenom='" + getPrenom() + "'" +
                ", date_naissance='" + getDate_naissance() + "'";
    }

    public void Afficher() {
        System.out.println(toString());
    }

}
