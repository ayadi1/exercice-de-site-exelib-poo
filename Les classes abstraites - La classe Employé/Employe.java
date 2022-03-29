import java.util.Calendar;
import java.util.Date;

public abstract class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private Date date_naissance;

    // --------------- constructeur ---------------
    // --------------------------------------------

    public Employe() {
    }

    public Employe(int matricule, String nom, String prenom, Date date_naissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
    }

    // --------------- Getters Setters ---------------
    // -----------------------------------------------

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

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public abstract double GetSalaire();

    @Override
    public String toString() {
        return " matricule='" + getMatricule() + "'" +
                ", nom='" + getNom() + "'" +
                ", prenom='" + getPrenom() + "'" +
                ", date_naissance='" + getDate_naissance() + "'}";
    }

}
