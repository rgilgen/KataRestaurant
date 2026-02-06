package ch.css.produkt.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    Map<String, List<String>> orders = new HashMap<>();

    public String printBill(String name) {
        return "Rechnung für: %s\n%s".formatted(name, String.join("\n", orders.getOrDefault(name, List.of())));
    }

    public String placeOrder(String name, String order) {
        orders.computeIfAbsent(name, k -> new ArrayList<>()).add(order);
        return String.join("\n", orders.get(name));
    }
}
