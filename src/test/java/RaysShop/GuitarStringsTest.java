package RaysShop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void canSetUp() {
        guitarStrings = new GuitarStrings("Nickel", 3, 5);
    }

    @Test
    public void getMaterial() {
        assertEquals("Nickel", guitarStrings.getMaterial());
    }

    @Test
    public void setMaterial() {
        guitarStrings.setMaterial("Steel");
        assertEquals("Steel", guitarStrings.getMaterial());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(3, guitarStrings.getWholesalePrice());
    }

    @Test
    public void canSetWholesalePrice() {
        guitarStrings.setWholesalePrice(4);
        assertEquals(4, guitarStrings.getWholesalePrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(5, guitarStrings.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        guitarStrings.setSellingPrice(6);
        assertEquals(6, guitarStrings.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.0, guitarStrings.calculateMarkup());
    }
}