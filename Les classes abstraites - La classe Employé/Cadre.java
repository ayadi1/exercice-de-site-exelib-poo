import java.util.Date;

public class Cadre extends Employe {

    private int indice;

    // --------------- constructeur ---------------
    // --------------------------------------------

    public Cadre() {
    }

    public Cadre(int matricule, String nom, String prenom, Date date_naissance, int indice) {
        super(matricule, nom, prenom, date_naissance);
        this.setIndice(indice);
    }

    public int getIndice() {
        return this.indice;
    }

    public void setIndice(int indice) {
        if (indice > 0 && indice < 5) {
            this.indice = indice;
        } else {
            this.indice = 1;
            System.out.println("tu donnée  indice  ñ'existe pas ");
        }
    }

    public double GetSalaire() {
        switch (getIndice()) {
            case 1:
                return 13000.0;
            case 2:
                return 15000.0;
            case 3:
                return 17000.0;
            case 4:
                return 20000.0;
            default:
                return 0.0;
        }
    }

    // -------------- toString ----------------------
    // ----------------------------------------------

    @Override
    public String toString() {
        return "{" +
                " indice='" + getIndice() + "'" + super.toString();
    }

}
