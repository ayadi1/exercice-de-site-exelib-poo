public class Point {
    private double x;
    private double y;

    // --------------------------------------------------------
    // --------------------- constructeur ---------------------
    // --------------------------------------------------------

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // --------------------------------------------------------
    // --------------------- getters setters ------------------
    // --------------------------------------------------------

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // --------------------------------------------------------
    // ------------------------ Methods -----------------------
    // --------------------------------------------------------
    public void Afficher() {
        System.out.println(
                "POINT(" + getX() + "," + getY() + ").");
    }
}
