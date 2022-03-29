public class Maison extends Batiment {

    private int NbPieces;

    // --------------------- constructeurs ---------------------
    // ---------------------------------------------------------
    public Maison() {
    }

    public Maison(String adresse, int NbPieces) {
        super(adresse);
        this.NbPieces = NbPieces;
    }

    // --------------------- getters setters ---------------------
    // -----------------------------------------------------------
    public int getNbPieces() {
        return this.NbPieces;
    }

    public void setNbPieces(int NbPieces) {
        this.NbPieces = NbPieces;
    }

    // ------------------------ toString -------------------------
    // -----------------------------------------------------------

    @Override
    public String toString() {
        return super.toString() +
                " NbPieces='" + getNbPieces() + "'" +
                "}";
    }

}
