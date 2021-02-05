package RaysShop;

public class Shop {

    private String name;
    private int moneyInTill;

    public Shop(String name, int moneyInTill){
        this.name = name;
        this.moneyInTill = moneyInTill;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyInTill() {
        return this.moneyInTill;
    }

    public void setMoneyInTill(int moneyInTill) {
        this.moneyInTill = moneyInTill;
    }
}
