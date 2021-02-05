package RaysShop;

import Interfaces.ISell;

public class Drumsticks implements ISell {

    private String materialType;
    private int wholesalePrice;
    private int sellingPrice;

    public Drumsticks(String materialType, int wholesalePrice, int sellingPrice) {
        this.materialType = materialType;
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterialType() {
        return this.materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
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
