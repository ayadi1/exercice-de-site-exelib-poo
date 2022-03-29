public class Chef extends Employe {
    private String service;

    // ---------- constructeur ----------

    public Chef() {
        super();
    }

    public Chef(String nom, String prenom, String date_naissance, double Salaire, String service) {
        super(nom, prenom, date_naissance, Salaire);
        this.service = service;
    }
    // ---------- getters setters ----------

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    // ---------- toString ----------
    @Override
    public String toString() {
        return super.toString() +
                "service='" + getService() + "'";
    }

}
