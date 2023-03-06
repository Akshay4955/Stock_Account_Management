package com.bridgelabz.stockmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockAccount {
    List<Stock> stockList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Stock Management System");
        Scanner input = new Scanner(System.in);
        StockAccount stockAccount = new StockAccount();
        boolean loop = true;
        while(loop) {
            System.out.println("Plz Enter what you want perform:");
            System.out.println("Press 1 to add stock" + '\n' + "Press 2 to get Stock report" + '\n' +
                    "Press 3 to exit");
            int option = input.nextInt();
            final int addStock = 1, stockReport = 2, exit = 3;
            switch (option) {
                case addStock:
                    Stock stock = new Stock();
                    System.out.println("Please Enter Stock Name");
                    stock.setStockName(input.next());
                    System.out.println("Please Enter No of Shares");
                    stock.setNoOfShare(input.nextInt());
                    System.out.println("Plz Enter share price");
                    stock.setSharePrice(input.nextInt());
                    stockAccount.stockList.add(stock);
                    break;
                case stockReport:
                    System.out.println("Stock Report :");
                    stockAccount.calculateStockValue();
                    break;
                case exit:
                    loop = false;
                    break;
                default:
                    System.out.println("You entered wrong input");
            }
        }
    }
    public void calculateStockValue() {
        double totalValue = 0, valueOfStock;
        for (Stock x : stockList) {
            valueOfStock = x.getNoOfShare() * x.getSharePrice();
            System.out.println("Value of Stock for " + x.getStockName() + " is " + valueOfStock);
            totalValue += valueOfStock;
        }
        System.out.println("Total value of stock is " + totalValue);
    }
}
