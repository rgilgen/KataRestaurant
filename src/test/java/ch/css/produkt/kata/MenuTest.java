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
    void test_getItemPrice() {
        String expected = "";
        Menu testee = new Menu();

        String result = testee.getItemPrice(null);

        assertEquals(expected, result);
    }
}