package RaysShop;

public abstract class Instrument {

    private String model;
    private String colour;

    public Instrument(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
