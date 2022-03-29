public class Main {
    public static void main(String[] args) {
        Complexes Z1 = new Complexes(3, 4);
        Complexes Z2 = new Complexes(6, -10);

        System.out.println(Z1.Plus(Z2));
        System.out.println(Z1.Moins(Z2));
    }

}