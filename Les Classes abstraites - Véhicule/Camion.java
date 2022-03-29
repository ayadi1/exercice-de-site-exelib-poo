public class Camion extends Vehicule {
    // -------------------- constructor --------------------
    // -----------------------------------------------------

    public Camion() {
    }

    public Camion(int annee, int prix) {
        super(annee, prix);
    }

    // ------------------------ methods ------------------------
    // ----------------------------------------------------------
    public void demarrer() {
        System.out.println("demarrer de Camion");
    };

    public void accelerer() {
        System.out.println("accelerer de Camion");

    };
}
