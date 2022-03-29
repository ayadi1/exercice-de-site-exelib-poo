import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personne omar = new Personne("omar", "ourini", "berkane");
        Personne oussama = new Employe("nom", "prenom", "date_naissance", 1.2);
        Personne ahmed = new Chef("ahmed", "omari", "oujda", 12.3, "chef");
        Personne amine = new Directeur("ahmed", "omari", "oujda", 12.3, "chef","google");
        
        List<Personne> l = new ArrayList<Personne>();
        l.add(omar);
        l.add(oussama);
        l.add(ahmed);
        l.add(amine);
        
        for (Personne personne : l) {
            System.out.println(personne);
        }
    }
}
