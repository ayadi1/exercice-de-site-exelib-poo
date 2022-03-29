import java.util.Scanner;

public class Compte {
    private double solde;
    private int code;
    private Client proprietaire;
    private static int nb_compte;

    // ---------------------------- constructeur ----------------------------
    // ----------------------------------------------------------------------
    public Compte() {
    }

    public Compte(double solde, Client proprietaire) {
        this.solde = solde;
        this.code = ++nb_compte;
        this.proprietaire = proprietaire;
    }

    // ---------------------------- getters setters ------------------------
    // ---------------------------------------------------------------------

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Client getProprietaire() {
        return this.proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    // -------------------------------- methods ----------------------------
    // ---------------------------------------------------------------------
    public void Crediter() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Donner le montant à retirer:");
            double newSolde = s.nextDouble();
            this.solde -= newSolde;
            s.close();

        } catch (Exception e) {
            System.out.println("veuillez indiquer un numéro");
        }
    }

    public void Debiter() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Donner le montant à déposer:");
            double newSolde = s.nextDouble();
            this.solde += newSolde;
            s.close();

        } catch (Exception e) {
            System.out.println("veuillez indiquer un numéro");
        }
    }

    // ------------------------------ toString -----------------------------
    // ---------------------------------------------------------------------

    @Override
    public String toString() {
        return "{" +
                ", code='" + getCode() + "'" +
                " solde='" + getSolde() + "'" +
                ", proprietaire='" + getProprietaire() + "'" +
                "}";
    }

    public void Afficher() {
        System.out.println(toString());
    }

}