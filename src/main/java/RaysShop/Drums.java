package RaysShop;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell{

    private String type;
    private int size;
    private int wholesalePrice;
    private int sellingPrice;

    public Drums(String model, String colour, String type, int size, int wholesalePrice, int sellingPrice){
        super(model, colour);
        this.type = type;
        this.size = size;
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
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

    public String play() {
        return "She bangs the drums";
    }

}
