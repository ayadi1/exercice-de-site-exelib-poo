public class Client {
    private String CIN;
    private String npm;
    private String prenom;
    private String tel;

    // ---------------------------- constructeur ----------------------------
    // ----------------------------------------------------------------------

    public Client() {
    }

    public Client(String CIN, String npm, String prenom, String tel) {
        this.CIN = CIN;
        this.npm = npm;
        this.prenom = prenom;
        this.tel = tel;
    }

    public Client(String CIN, String npm, String prenom) {
        this.CIN = CIN;
        this.npm = npm;
        this.prenom = prenom;
    }

    // ---------------------------- getters setters ------------------------
    // ---------------------------------------------------------------------

    public String getCIN() {
        return this.CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNpm() {
        return this.npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    // ------------------------------ toString -----------------------------
    // ---------------------------------------------------------------------

    @Override
    public String toString() {
        return "{" +
                " CIN='" + getCIN() + "'" +
                ", npm='" + getNpm() + "'" +
                ", prenom='" + getPrenom() + "'" +
                ", tel='" + getTel() + "'" +
                "}";
    }

    public void Afficher() {
        System.out.println(toString());
    }

}
