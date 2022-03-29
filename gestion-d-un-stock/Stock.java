import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Article> l = new ArrayList<Article>();

    public void ajouter_article(Article article) {
        if (!RechercherParReference(article.getReference())) {
            l.add(article);
        } else {
            System.out.println("produit deja existe");
        }

    }

    public Article Rechercher(int reference) {
        for (Article article : l) {
            if (article.getReference() == reference) {
                return article;
            }
        }
        return null;
    }

    public boolean RechercherParReference(int reference) {
        for (Article article : l) {
            if (article.getReference() == reference) {
                return true;
            }
        }
        return false;
    }

    public void Supprimer(int reference) {
        if (RechercherParReference(reference)) {
            l.remove(Rechercher(reference));
        } else {
            System.out.println("produit deja existe");
        }

    }

    public List<Article> Rechercher(String nom) {
        List<Article> articles = new ArrayList<Article>();
        for (Article article : l) {
            if (article.getNom() == nom) {
                articles.add(article);
            }
        }
        return articles;
    }

    public List<Article> Rechercher(Double prixBas, double prixHoute) {
        List<Article> articles = new ArrayList<Article>();
        for (Article article : l) {
            if (article.getPrix() >= prixBas && article.getPrix() <= prixHoute) {
                articles.add(article);
            }
        }
        return articles;
    }

    public List<Article> Rechercher(int prixBas, int prixHoute) {
        List<Article> articles = new ArrayList<Article>();
        for (Article article : l) {
            if (article.getPrix() >= prixBas && article.getPrix() <= prixHoute) {
                articles.add(article);
            }
        }
        return articles;
    }

    public void Afficher() {
        for (Article article : l) {
            System.out.println(article);
        }
    }
}
