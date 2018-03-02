package com.kofera.learning.koferalearning.domain;

import java.util.List;

public class TotalCartResponse {
    private List<Item> itemList;
    private Double total;

    public TotalCartResponse() {

    }

    public TotalCartResponse(List<Item> itemList, Double total) {
        this.itemList = itemList;
        this.total = total;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TotalCartResponse{" +
                "itemList=" + itemList +
                ", total=" + total +
                '}';
    }
}