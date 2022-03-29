public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 12.3);

        Cercle c = new Cercle(1, 12.3, 19);
        System.out.println(c.appartient(a));
        c.Afficher();

    }

}