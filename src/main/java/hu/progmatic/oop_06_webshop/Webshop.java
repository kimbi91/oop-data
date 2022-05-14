package hu.progmatic.oop_06_webshop;

import java.util.*;

public class Webshop {

    private String name;
    private final Set<Product> products = new TreeSet<>();
    private final List<Order> orders = new ArrayList<>();


    public Webshop() {
    }

    public Webshop(String name) {
        this.name = name;
    }

    public void updateProduct(Product product) {
        products.remove(product);
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public String getProductsRepors() {
        StringBuilder builder = new StringBuilder();

        builder
                .append("********************\n").append(name).append("\n")
                .append("********************\n");

        for (Product product : products) {
            builder.append(product).append("\n");
        }

        return builder.toString();
    }

    public String getOrdersReport() {
        StringBuilder builder = new StringBuilder();

        builder
                .append("********************\n").append(name).append("\n")
                .append("********************\n");

        for (Order order : orders) {
            builder.append(order + "\n");
        }

        return builder.toString();
    }

    public Order[] listOrders() {
        return orders.toArray(new Order[0]);
    }

    public void newOrder(String address, Product product) {
        newOrder(address, product, 1);
    }

    public void newOrder(String address, Product product, int quantity) {
        orders.add(new Order(orders.size() + 1, product, quantity , address));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
