package RaysShop;

import Interfaces.ISell;

public class GuitarStrings implements ISell {

    private String material;
    private int wholesalePrice;
    private int sellingPrice;

    public GuitarStrings(String material, int wholesalePrice, int sellingPrice) {
        this.material = material;
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
