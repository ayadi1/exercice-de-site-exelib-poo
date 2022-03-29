public class Batiment {
    private String adresse;

    // --------------------- constructeurs ---------------------
    // ---------------------------------------------------------
    public Batiment() {
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    // --------------------- getters setters ---------------------
    // -----------------------------------------------------------
    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // ------------------------ toString -------------------------
    // -----------------------------------------------------------

    @Override
    public String toString() {
        return "{" +
                " adresse='" + getAdresse() + "'";
    }

}
