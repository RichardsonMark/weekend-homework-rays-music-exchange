package RaysShop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class KeyboardTest {

    Keyboard korg;
    Keyboard moog;

    @Before
    public void setUp() {
        korg = new Keyboard("Korg Monologue","Black", "Analogue Synthesizer", 25, 200, 250);
        moog = new Keyboard("Moog Grandmother","Multi coloured", "Semi-Modular Analog Synthesizer", 32, 750, 995);
    }

    @Test
    public void getModel() {
        assertEquals("Korg Monologue", korg.getModel());
    }

    @Test
    public void setModel() {
        korg.setModel("Korg MicroKORG");
        assertEquals("Korg MicroKORG", korg.getModel());
    }

    @Test
    public void getColour() {
        assertEquals("Black", korg.getColour());
    }

    @Test
    public void canSetColour() {
        korg.setColour("Silver");
        assertEquals("Silver", korg.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Analogue Synthesizer", korg.getType());
    }

    @Test
    public void canSetType() {
        moog.setType("Semi-Modular Analogue Synthesizer");
        assertEquals("Semi-Modular Analogue Synthesizer", moog.getType());
    }

    @Test
    public void getNumKeys() {
        assertEquals(32, moog.getNumKeys());

    }

    @Test
    public void setNumKeys() {
        moog.setNumKeys(37);
        assertEquals(37, moog.getNumKeys());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(750, moog.getWholesalePrice());
    }

    @Test
    public void canSetWholesalePrice() {
        moog.setWholesalePrice(725);
        assertEquals(725, moog.getWholesalePrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(250, korg.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        korg.setSellingPrice(275);
        assertEquals(275, korg.getSellingPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Pew pew!", korg.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.0, korg.calculateMarkup());
    }
}