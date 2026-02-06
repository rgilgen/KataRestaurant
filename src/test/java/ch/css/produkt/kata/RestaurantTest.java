package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RestaurantTest {

    public static final String ANNA = "Anna";
    private static final String BERTA = "Berta";


    @Test
    void printBill() {
        String expected = """
                Rechnung für: Anna
                
                -----------------------------
                
                
                
                -----------------------------
                
                Total: 0.00 CHF""";
        Restaurant restaurant = new Restaurant();

        String actual = restaurant.printBill(ANNA);

        assertEquals(expected, actual);
    }

    @Test
    void placeOrder() {
        String expected = "Kaffee";
        Restaurant restaurant = new Restaurant();

        String actual = restaurant.placeOrder(ANNA, Collections.singletonList(expected));

        assertEquals(expected, actual);
    }

    @Test
    void placeTwoOrders() {
        String order = "Kaffee";
        String expected = order + "\n" + order;
        Restaurant restaurant = new Restaurant();

        restaurant.placeOrder(ANNA, Collections.singletonList(order));
        String actual = restaurant.placeOrder(ANNA, Collections.singletonList(order));

        assertEquals(expected, actual);
    }

    @Test
    void placePrintBillForBerta() {
        String order = "Kaffee";
        String expected = """
                Rechnung für: Berta
                
                -----------------------------
                
                Kaffee               4.50 CHF
                Kaffee               4.50 CHF
                
                -----------------------------
                
                Total: 9.00 CHF""";
        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(BERTA, Collections.singletonList(order));
        restaurant.placeOrder(BERTA, Collections.singletonList(order));

        String actual = restaurant.printBill(BERTA);

        assertEquals(expected, actual);
    }

    @Test
    void placeOrderMitUngueltigmMenueItem() {
        String order = "Motorsäge";
        Restaurant restaurant = new Restaurant();

        assertThrows(IllegalArgumentException.class, () -> restaurant.placeOrder(ANNA, Collections.singletonList(order)));

    }

    @Test
    void placeMultipleItems() {
        List<String> orders = Arrays.asList("Mineralwasser", "Suppe", "Schnitzel Pommesfrites");
        String expected = """
                Rechnung für: Berta
                
                -----------------------------
                
                Mineralwasser        4.00 CHF
                Suppe                8.00 CHF
                Schnitzel Pommesfrites18.00 CHF
                
                -----------------------------
                
                Total: 30.00 CHF""";
        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(BERTA, orders);

        String actual = restaurant.printBill(BERTA);

        assertEquals(expected, actual);
    }
}