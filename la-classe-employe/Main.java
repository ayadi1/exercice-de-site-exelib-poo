import java.util.Date;

class Main {
    public static void main(String[] args) {
        Employe oussama = new Employe(1, "oussama", "ayadi", new Date(1999 - 1900, 11 - 1, 17),
                new Date(2011 - 1900, 01 - 1, 01), 10000);
        oussama.AugmentationDuSalaire();
        System.out.println(oussama);
    }
}