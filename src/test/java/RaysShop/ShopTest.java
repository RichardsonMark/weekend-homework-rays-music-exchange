package RaysShop;

import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell drumsticks;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Shop", 5000);
        drumsticks = new Drumsticks("Wood", 3, 5);
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Shop", shop.getName());
    }

    @Test
    public void canSetName() {
        shop.setName("Ray's");
        assertEquals("Ray's", shop.getName());
    }

    @Test
    public void canGetMoneyInTill() {
        assertEquals(5000, shop.getMoneyInTill());
    }

    @Test
    public void canSetMoneyInTill() {
        shop.setMoneyInTill(500);
        assertEquals(500, shop.getMoneyInTill());
    }

    @Test
    public void canGetStock(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItemsToStock(drumsticks);
        assertEquals(1, shop.getStock());

    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.removeItemsFromStock(drumsticks);
    }
}