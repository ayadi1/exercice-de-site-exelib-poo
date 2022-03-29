public class Cercle {
    private Point centre;
    private double R;

    // --------------------------------------------------------
    // --------------------- constructeur ---------------------
    // --------------------------------------------------------

    public Cercle() {
    }

    public Cercle(Point centre, double R) {
        this.centre = centre;
        this.R = R;
    }

    public Cercle(double x, double y, double R) {
        this.R = R;
        this.centre = new Point(x, y);
    }
    // --------------------------------------------------------
    // --------------------- getters setters ------------------
    // --------------------------------------------------------

    public Point getCentre() {
        return this.centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getR() {
        return this.R;
    }

    public void setR(double R) {
        this.R = R;
    }

    // --------------------------------------------------------
    // ------------------------ Methods -----------------------
    // --------------------------------------------------------
    public void Afficher() {
        System.out.println(
                "CERCLE(" + getCentre().getX() + "," + getCentre().getY() + "," + getR() + ").");
    }

    public double getPerimetre() {
        return 2 * Math.PI * getR();
    }

    public double getSurface() {
        return 2 * Math.PI * getR() * getR();
    }

    public boolean appartient(Point p) {
        double d = Math.sqrt((p.getX() - centre.getX()) + (p.getY() - centre.getY()));
        if (d <= getR()) {
            return true;
        }
        return false;
    }
}
