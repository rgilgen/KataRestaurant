package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    public static final String ANNA = "Anna";


    @Test
    void printBill() {
        String expected = "Rechnung für Anna";
        Restaurant restaurant = new Restaurant();

        String actual = restaurant.printBill(ANNA);

        assertEquals(expected, actual);
    }

    @Test
    void placeOrder() {
        String order = "Kaffee";
        String expected = order;
        Restaurant restaurant = new Restaurant();

        String actual = restaurant.placeOrder(ANNA, order);

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
}