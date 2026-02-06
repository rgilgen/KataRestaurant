package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        String actual = restaurant.placeOrder(ANNA, expected);

        assertEquals(expected, actual);
    }

    @Test
    void placeTwoOrders() {
        String order = "Kaffee";
        String expected = order + "\n" + order;
        Restaurant restaurant = new Restaurant();

        restaurant.placeOrder(ANNA, order);
        String actual = restaurant.placeOrder(ANNA, order);

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
        restaurant.placeOrder(BERTA, order);
        restaurant.placeOrder(BERTA, order);

        String actual = restaurant.printBill(BERTA);

        assertEquals(expected, actual);
    }

    @Test
    void placeOrderMitUngueltigmMenueItem() {
        String order = "Motorsäge";
        Restaurant restaurant = new Restaurant();

        assertThrows(IllegalArgumentException.class, () -> restaurant.placeOrder(ANNA, order));

    }
}