package ch.css.produkt.kata;

import java.util.Map;

public class Menu {
    static Map<String, Double> menu = Map.of(
            "Mineralwasser", 4.00,
            "Süssgetränk", 5.00,
            "Kaffee oder Tee", 4.50,
            "Suppe", 8.00,
            "Salat", 8.00,
            "Spezialität des Kochs", 25.00,
            "Schnitzel Pommesfrites", 18.00,
            "Tabulé", 18.00
    );

    public static String getItemPrice(String order) {
        if (order != null) {
            return menu.entrySet().stream()
                    .filter(entry -> entry.getKey().contains(order))
                    .map(entry -> String.format("%.2f", entry.getValue()))
                    .findFirst()
                    .orElse("");

        }
        return "";
    }

    public static void checkMenuItem(String menuItem) {
        menu.keySet()
                .stream()
                .filter(k -> k.contains(menuItem))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Item not on the menu: " + menuItem));
    }
}

