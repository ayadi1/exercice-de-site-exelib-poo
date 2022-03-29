class Main {
    public static void main(String[] args) {
        Article iphone = new Article(1, "iphone 5", 100.1, 10);
        Article samsung = new Article(2, "samsung 5", 99.1, 14);
        Article huawei = new Article(3, "huawei 5", 190.3, 20);
        Article infinix = new Article(4, "infinix 5", 50.3, 40);
        Stock stock = new Stock();
        stock.ajouter_article(iphone);
        stock.ajouter_article(samsung);
        stock.ajouter_article(huawei);
        stock.ajouter_article(infinix);

        stock.Afficher();
    }
}