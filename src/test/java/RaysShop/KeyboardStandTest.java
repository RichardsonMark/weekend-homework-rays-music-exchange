package RaysShop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class KeyboardStandTest {

    KeyboardStand keyboardStand;

    @Before
    public void canSetUp() {
        keyboardStand = new KeyboardStand("Full-size", 50, 95);
    }

    @Test
    public void canGetSize() {
        assertEquals("Full-size", keyboardStand.getSize());
    }

    @Test
    public void canSetSize() {
        keyboardStand.setSize("Large");
        assertEquals("Large", keyboardStand.getSize());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(50, keyboardStand.getWholesalePrice());
    }

    @Test
    public void canSetWholesalePrice() {
        keyboardStand.setWholesalePrice(55);
        assertEquals(55, keyboardStand.getWholesalePrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(95, keyboardStand.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        keyboardStand.setSellingPrice(100);
        assertEquals(100, keyboardStand.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(45.00, keyboardStand.calculateMarkup());
    }
}