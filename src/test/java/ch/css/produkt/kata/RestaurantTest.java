package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    public static final String ANNA = "Anna";
    private static final String BERTA = "Berta";


    @Test
    void printBill() {
        String expected = "Rechnung für: Anna\n\n Total: 0.00 CHF";
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
        String anrede = "Rechnung für: ";
        String order = "Kaffee";
        String total = "Total: 9.00 CHF";
        String expected = anrede + BERTA + "\n" + order + " 4.50 CHF\n" + order + " 4.50 CHF"+ "\n" + total;
        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(BERTA, order);
        restaurant.placeOrder(BERTA, order);

        String actual = restaurant.printBill(BERTA);

        assertEquals(expected, actual);
    }
}