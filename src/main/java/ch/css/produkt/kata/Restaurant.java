package ch.css.produkt.kata;

public class Restaurant {
    public String printBill(String name) {
        return "Rechnung für %s".formatted(name);
    }

    public String placeOrder(String name, String order) {
        return name + ": " + order;

    }
}
