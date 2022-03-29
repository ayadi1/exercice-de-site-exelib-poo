public class Article {
    private int reference;
    private String nom;
    private double prix;
    private int quantite;

    // ############## constructeur ##############
    public Article() {

    }

    public Article(int reference, String nom, double prix, int quantite) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }
    // ############## getters setters ##############

    public int getReference() {
        return this.reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    // ############## toString ##############

    @Override
    public String toString() {
        return "{" +
                " reference='" + getReference() + "'" +
                ", nom='" + getNom() + "'" +
                ", prix='" + getPrix() + "'" +
                ", quantite='" + getQuantite() + "'" +
                "}";
    }

}
