package RaysShop;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell{

    private String model;
    private String colour;
    private String type;
    private int size;
    private int wholesalePrice;
    private int sellingPrice;

    public Drums(String model, String colour, String type, int size, int wholesalePrice, int sellingPrice){
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return "She bangs the drums";
    }

}
