package RaysShop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private int moneyInTill;
    private ArrayList<ISell> arrayListStock;

    public Shop(String name, int moneyInTill){
        this.name = name;
        this.moneyInTill = moneyInTill;
        this.arrayListStock = new ArrayList<ISell>();
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

    public int getStock(){
        return this.arrayListStock.size();
    }

    public void addItemsToStock(ISell item){
        this.arrayListStock.add(item);
    }

    public void removeItemsFromStock(ISell item){
        this.arrayListStock.remove(item);
    }
}
