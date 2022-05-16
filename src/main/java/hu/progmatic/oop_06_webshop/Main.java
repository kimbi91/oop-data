package hu.progmatic.oop_06_webshop;


import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Product product = new Product( "Fából vaskarika", 5000);
        Product product2 = new Product( "Nesze semmi fogd meg jol", 4000);
        Product product3 = new Product( "termék 3", 4000);
        Product product4 = new Product( "termék 4", 4000);
        Product product5 = new Product( "termék 5", 4000);
        Product product6 = new Product( "termék 6", 4000);
        Webshop webshop = new Webshop("Legjobb webshop");
        webshop.newOrder("Nekeresd", product);
        webshop.newOrder("Budapest", product2);

        System.out.println(webshop.getOrdersReport());


    }
}
