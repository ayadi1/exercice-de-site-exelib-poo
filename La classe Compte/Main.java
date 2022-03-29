public class Main {
    public static void main(String[] args) {
        Client oussama = new Client("fa1234", "oussama", "ayadi", "0123456789");
        Compte cb1 = new Compte(1000, oussama);
        cb1.Debiter();
        cb1.Crediter();
        System.out.println(cb1);
    }
}