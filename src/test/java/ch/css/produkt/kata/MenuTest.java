package ch.css.produkt.kata;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    @Description("""
                001 GIVEN Keine Items
                WHEN getItemPrice
                THEN leerer String
            """)
    void test_getItemPrice1() {
        String expected = "";

        String result = Menu.getItemPrice(null);

        assertEquals(expected, result);
    }

    @Test
    @Description("""
                002 GIVEN Kaffee order
                WHEN getItemPrice
                THEN 4.50
            """)
    void test_getItemPrice2() {
        String expected = "4.50";
        String order = "Kaffee";

        String result = Menu.getItemPrice(order);

        assertEquals(expected, result);
    }
}