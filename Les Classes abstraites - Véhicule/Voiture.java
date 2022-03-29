public class Voiture extends Vehicule {

    // -------------------- constructor --------------------
    // -----------------------------------------------------

    public Voiture() {
    }

    public Voiture(int annee, int prix) {
        super(annee, prix);
    }

    // ------------------------ methods ------------------------
    // ----------------------------------------------------------
    public void demarrer() {
        System.out.println("demarrer de Voiture");

    };

    public void accelerer() {
        System.out.println("accelerer de Voiture");

    };
}
