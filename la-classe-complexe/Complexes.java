public class Complexes {
    private double PartieReelle;
    private double PartieImaginaire;

    // ----------------------------------------------------
    // ------------------- constructeur -------------------
    // ----------------------------------------------------

    public Complexes() {
        this.PartieImaginaire = 0;
        this.PartieReelle = 0;
    }

    public Complexes(double PartieReelle, double PartieImaginaire) {
        this.PartieReelle = PartieReelle;
        this.PartieImaginaire = PartieImaginaire;
    }

    // ----------------------------------------------------
    // ------------------ getters setters -----------------
    // ----------------------------------------------------

    public double getPartieReelle() {
        return this.PartieReelle;
    }

    public void setPartieReelle(double PartieReelle) {
        this.PartieReelle = PartieReelle;
    }

    public double getPartieImaginaire() {
        return this.PartieImaginaire;
    }

    public void setPartieImaginaire(double PartieImaginaire) {
        this.PartieImaginaire = PartieImaginaire;
    }

    // ----------------------------------------------------
    // ---------------------- Methods ---------------------
    // ----------------------------------------------------

    public Complexes Plus(Complexes z) {
        return new Complexes(getPartieReelle() + z.getPartieReelle(), getPartieImaginaire() + z.getPartieImaginaire());
    }

    public Complexes Moins(Complexes z) {
        return new Complexes(getPartieReelle() - z.getPartieReelle(), getPartieImaginaire() - z.getPartieImaginaire());

    }

    public void Afficher() {
        System.out.println(toString());
    }

    // ----------------------------------------------------
    // ---------------------- toString --------------------
    // ----------------------------------------------------
    @Override
    public String toString() {
        return getPartieReelle() + " + " + getPartieImaginaire() + "*i";
    }

}
