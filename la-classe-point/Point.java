public class Point {
    private double abscisse;
    private double ordonné;

    // ----------------------------------------------------------
    // ---------------------- constructeur ----------------------
    // ----------------------------------------------------------

    public Point() {
    }

    public Point(double abscisse, double ordonné) {
        this.abscisse = abscisse;
        this.ordonné = ordonné;
    }

    // ----------------------------------------------------------
    // ---------------------- getters setters -------------------
    // ----------------------------------------------------------

    public double getAbscisse() {
        return this.abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonné() {
        return this.ordonné;
    }

    public void setOrdonné(double ordonné) {
        this.ordonné = ordonné;
    }

    public void Norme() {
        double d = Math.sqrt((getOrdonné() * getOrdonné()) + (getAbscisse() * getAbscisse()));
        System.out.println("La norme du point (1,2) est:" + d);
    }
    // ----------------------------------------------------------
    // ---------------------- toString --------------------------
    // ----------------------------------------------------------

    @Override
    public String toString() {
        return "{" +
                " abscisse='" + getAbscisse() + "'" +
                ", ordonné='" + getOrdonné() + "'" +
                "}";
    }

}
