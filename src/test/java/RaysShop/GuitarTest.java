package RaysShop;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GuitarTest {

    Guitar guitar;
    Guitar bassGuitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Fender KC Jaguar","3-Tone Sunburst", "left handed six string guitar", 6, 1050, 1300);
        bassGuitar = new Guitar("Fender Player Mustang","Aged Natural", "right handed bass guitar", 4, 450, 650);

    }

    @Test
    public void canGetModel() {
        assertEquals("Fender KC Jaguar", guitar.getModel());
    }

    @Test
    public void canSetModel() {
        guitar.setModel("Fender Kurt Cobain Jaguar");
        assertEquals("Fender Kurt Cobain Jaguar", guitar.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("3-Tone Sunburst", guitar.getColour());
    }

    @Test
    public void canSetColour() {
        guitar.setColour("Cherry Sunburst");
        assertEquals("Cherry Sunburst", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("left handed six string guitar", guitar.getType());
    }

    @Test
    public void canSetType() {
        guitar.setType("Left-handed six-string guitar");
        assertEquals("Left-handed six-string guitar", guitar.getType());
    }

    @Test
    public void canGetMumStrings() {
        assertEquals(4, bassGuitar.getMumStrings());
    }

    @Test
    public void canSetMumStrings() {
        bassGuitar.setMumStrings(5);
        assertEquals(5, bassGuitar.getMumStrings());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(450, bassGuitar.getWholesalePrice());
    }

    @Test
    public void canSetWholesalePrice() {
        bassGuitar.setWholesalePrice(475);
        assertEquals(475, bassGuitar.getWholesalePrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(1300, guitar.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice() {
        guitar.setSellingPrice(1275);
        assertEquals(1275, guitar.getSellingPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("No Stairway, denied!", guitar.play());
    }
}