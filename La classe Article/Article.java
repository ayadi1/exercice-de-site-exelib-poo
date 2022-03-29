public class Article {
    private String Reference;
    private String Designation;
    private double PrixHT;
    private int TauxTVA;

    // --------------------- constructeur ---------------------
    // --------------------------------------------------------

    public Article() {
    }

    public Article(String Reference, String Designation, double PrixHT, int TauxTVA) {
        this.Reference = Reference;
        this.Designation = Designation;
        this.PrixHT = PrixHT;
        this.TauxTVA = TauxTVA;
    }

    public Article recopie(Article article) {
        return new Article(article.getReference(), article.getDesignation(), article.getPrixHT(), article.getTauxTVA());
    }

    // -------------------- getters setters -------------------
    // --------------------------------------------------------

    public String getReference() {
        return this.Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public String getDesignation() {
        return this.Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getPrixHT() {
        return this.PrixHT;
    }

    public void setPrixHT(double PrixHT) {
        this.PrixHT = PrixHT;
    }

    public int getTauxTVA() {
        return this.TauxTVA;
    }

    public void setTauxTVA(int TauxTVA) {
        this.TauxTVA = TauxTVA;
    }

    // ----------------------- methods ------------------------
    // --------------------------------------------------------
}
