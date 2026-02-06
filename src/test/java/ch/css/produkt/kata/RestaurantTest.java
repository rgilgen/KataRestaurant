package ch.css.produkt.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RestaurantTest {

    @Test
    void printBill() {
        String expected = "Rechnung für Anna";

        Restaurant restaurant = new Restaurant();

        String actual = restaurant.printBill("Anna");

        assertEquals(expected, actual);
    }
}