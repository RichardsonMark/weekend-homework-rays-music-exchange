package RaysShop;

import Interfaces.ISell;

public class KeyboardStand implements ISell {

    private String size;
    private int wholesalePrice;
    private int sellingPrice;

    public KeyboardStand(String size, int wholesalePrice, int sellingPrice){
        this.size = size;
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWholesalePrice() {
        return this.wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.wholesalePrice;
    }
}
