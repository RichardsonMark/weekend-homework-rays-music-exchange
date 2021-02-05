package RaysShop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class DrumsTest {

    Drums cymbal;
    Drums bassDrum;


    @Before
    public void setUp() throws Exception {
        cymbal = new Drums("Zildjian Constantinople","Copper", "Ride Cymbal", 20, 350, 550);
        bassDrum = new Drums("Pearl EXX","High Voltage Blue", "Kick Drum", 18, 150, 250);
    }

    @Test
    public void getModel() {
        assertEquals("Zildjian Constantinople", cymbal.getModel());
    }

    @Test
    public void setModel() {
        cymbal.setModel("Zildjian Planet Z");
        assertEquals("Zildjian Planet Z", cymbal.getModel());
    }

    @Test
    public void getColour() {
        assertEquals("Copper", cymbal.getColour());
    }

    @Test
    public void canSetColour() {
        cymbal.setColour("Gold");
        assertEquals("Gold", cymbal.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Ride Cymbal", cymbal.getType());
    }

    @Test
    public void canSetType() {
        cymbal.setType("Crash Cymbal");
        assertEquals("Crash Cymbal", cymbal.getType());
    }

    @Test
    public void getSize() {
        assertEquals(18, bassDrum.getSize());
    }

    @Test
    public void setSize() {
        bassDrum.setSize(22);
        assertEquals(22, bassDrum.getSize());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(150, bassDrum.getWholesalePrice());
    }

    @Test
    public void canSetWholesalePrice() {
        bassDrum.setWholesalePrice(175);
        assertEquals(175, bassDrum.getWholesalePrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(250, bassDrum.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        bassDrum.setSellingPrice(275);
        assertEquals(275, bassDrum.getSellingPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("She bangs the drums", bassDrum.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200.00, cymbal.calculateMarkup());
    }
}