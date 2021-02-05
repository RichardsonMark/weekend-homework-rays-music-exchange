package RaysShop;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private String model;
    private String colour;
    private String type;
    private int mumStrings;
    private int wholesalePrice;
    private int sellingPrice;

    public Guitar(String model, String colour, String type, int mumStrings, int wholesalePrice, int sellingPrice){
        super(model, colour);
        this.type = type;
        this.mumStrings = mumStrings;
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMumStrings() {
        return this.mumStrings;
    }

    public void setMumStrings(int mumStrings) {
        this.mumStrings = mumStrings;
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

    public String play() {
        return "No Stairway, denied!";
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.wholesalePrice;
    }
}
