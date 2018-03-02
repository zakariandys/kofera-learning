package com.kofera.learning.koferalearning.domain;

public class Item {
    private String itemName;
    private Double totalName;

    public Item() {
    }

    public Item(String itemName, Double totalName) {
        this.itemName = itemName;
        this.totalName = totalName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getTotalName() {
        return totalName;
    }

    public void setTotalName(Double totalName) {
        this.totalName = totalName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", totalName=" + totalName +
                '}';
    }
}
