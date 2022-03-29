import java.util.Date;

public class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Date dateEmbauche;
    private double salaire;

    // ------------------ constructeur ------------------
    // --------------------------------------------------

    public Employe() {
    }

    public Employe(int matricule, String nom, String prenom, Date dateNaissance, Date dateEmbauche, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    // --------------------------------------------------
    // ----------------- getters setters ----------------
    // --------------------------------------------------

    public int getMatricule() {
        return this.matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

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

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateEmbauche() {
        return this.dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // --------------------------------------------------
    // --------------------- Methods --------------------
    // --------------------------------------------------

    public int Age() {
        return new Date().getYear() - getDateNaissance().getYear();
    }

    public int Anciennete() {
        return new Date().getYear() - getDateEmbauche().getYear();
    }

    public void AugmentationDuSalaire() {
        if (Anciennete() < 5) {
            setSalaire(getSalaire() + getSalaire() * 0.02);
        } else if (Anciennete() < 10) {
            setSalaire(getSalaire() + getSalaire() * 0.05);

        } else {
            setSalaire(getSalaire() + getSalaire() * 0.1);

        }

    }
    // --------------------------------------------------
    // -------------------- toString --------------------
    // --------------------------------------------------

    @Override
    public String toString() {
        return "{\n" +
                " matricule='" + getMatricule() + "'\n" +
                ", nom='" + getNom() + "'\n" +
                ", prenom='" + getPrenom() + "'\n" +
                ", dateNaissance='" + getDateNaissance() + "'\n" +
                ", dateEmbauche='" + getDateEmbauche() + "'\n" +
                ", salaire='" + getSalaire() + "'\n" +
                "}";
    }

}
