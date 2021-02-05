package RaysShop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void canSetUp() {
        drumsticks = new Drumsticks("Wood", 3, 5);
    }

    @Test
    public void getMaterialType() {
        assertEquals("Wood", drumsticks.getMaterialType());
    }

    @Test
    public void setMaterialType() {
        drumsticks.setMaterialType("Steel");
        assertEquals("Steel", drumsticks.getMaterialType());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(3, drumsticks.getWholesalePrice());
    }

    @Test
    public void canSetWholesalePrice() {
        drumsticks.setWholesalePrice(4);
        assertEquals(4, drumsticks.getWholesalePrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(5, drumsticks.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        drumsticks.setSellingPrice(6);
        assertEquals(6, drumsticks.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.0, drumsticks.calculateMarkup());
    }
}