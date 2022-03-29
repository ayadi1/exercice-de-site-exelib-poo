public abstract class Vehicule {
    private int matricule;
    private int annee;
    private int prix;
    private static int nb_de_vehicule = 0;

    // -------------------- constructor --------------------
    // -----------------------------------------------------

    public Vehicule() {
    }

    public Vehicule(int annee, int prix) {
        this.matricule = ++nb_de_vehicule;
        this.annee = annee;
        this.prix = prix;
    }

    // -------------------- getters setters --------------------
    // ---------------------------------------------------------

    public int getMatricule() {
        return this.matricule;
    }

    public int getAnnee() {
        return this.annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    // -------------------- abstract methods --------------------
    // ----------------------------------------------------------

    public abstract void demarrer();

    public abstract void accelerer();

    // ------------------------ toString ------------------------
    // ----------------------------------------------------------
    @Override
    public String toString() {
        return "{" +
                " matricule='" + getMatricule() + "'" +
                ", annee='" + getAnnee() + "'" +
                ", prix='" + getPrix() + "' }";
    }

}
