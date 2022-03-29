import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Ouvrier oussama = new Ouvrier(1, "oussama", "ayadi", new Date(), new Date(1991 - 1900, 01, 01));
        Cadre anas = new Cadre(2, "anas", "ahmadi", new Date(), 2);
        Patron omar = new Patron(3, "omar", "orini", new Date(), 10, 100000);
        System.out.println(omar.GetSalaire());
    }
}