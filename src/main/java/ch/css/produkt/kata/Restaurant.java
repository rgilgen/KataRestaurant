package ch.css.produkt.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    Map<String, List<String>> orders = new HashMap<>();
    Menu menu = new Menu();

    public String printBill(String name) {
        return "Rechnung für: %s\n%s".formatted(name, String.join("\n", printOrderLines(name)));
    }

    public String placeOrder(String name, String order) {
        orders.computeIfAbsent(name, k -> new ArrayList<>()).add(order);
        return String.join("\n", orders.get(name));
    }

    private List<String> printOrderLines(String name) {
        return orders.getOrDefault(name, List.of())
                .stream()
                .map(this::printOrderline)
                .toList();
    }

    private String printOrderline(String order) {
        String price = menu.getItemPrice(order);
        return order+ " " + price + " CHF";
    }
}
