package hu.progmatic.oop_05_webshop;


public class Main {

    public static void main(String[] args) {

        Product product = new Product(1, "Fából vaskarika", 5000);
        Product product2 = new Product(2, "Nesze semmi fogd meg jol", 4000);
        Product product3 = new Product(3, "termék 3", 4000);
        Product product4 = new Product(4, "termék 4", 4000);
        Product product5 = new Product(5, "termék 5", 4000);
        Product product6 = new Product(6, "termék 6", 4000);
        Webshop webshop = new Webshop("Legjobb webshop");
        webshop.newOrder("Nekeresd", product);
        webshop.newOrder("Budapest", product2);

        System.out.println(webshop.getOrdersReport());


    }
}
