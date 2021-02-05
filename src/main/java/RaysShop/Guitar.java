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
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.mumStrings = mumStrings;
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMumStrings() {
        return mumStrings;
    }

    public void setMumStrings(int mumStrings) {
        this.mumStrings = mumStrings;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String play() {
        return "No Stairway, denied!";
    }

}
