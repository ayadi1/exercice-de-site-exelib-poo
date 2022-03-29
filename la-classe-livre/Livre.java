public class Livre {
    private String Titre;
    private String Auteur;
    private double Prix;

    // -----------------------------------------------------
    // ------------------- constructeur --------------------
    // -----------------------------------------------------

    public Livre() {
    }

    public Livre(String Titre, String Auteur, double Prix) {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.Prix = Prix;
    }

    // -----------------------------------------------------
    // ----------------- getters setters -------------------
    // -----------------------------------------------------

    public String getTitre() {
        return this.Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public String getAuteur() {
        return this.Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    public double getPrix() {
        return this.Prix;
    }

    public void setPrix(double Prix) {
        this.Prix = Prix;
    }

    // -----------------------------------------------------
    // --------------------- toString ----------------------
    // -----------------------------------------------------
    public void Afficher() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{" +
                " Titre='" + getTitre() + "'" +
                ", Auteur='" + getAuteur() + "'" +
                ", Prix='" + getPrix() + "$'" +
                "}";
    }

}
