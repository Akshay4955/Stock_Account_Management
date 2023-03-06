package com.bridgelabz.stockmanagement;

public class Stock {
    private String stockName;
    private int noOfShare;
    private int sharePrice;

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockName() {
        return stockName;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getSharePrice() {
        return sharePrice;
    }
}
