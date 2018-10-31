package com.wurui;

public class Transaction {
    private Trader trader;
    private int day;
    private int money;

    public Transaction(Trader trader, int day, int money) {
        this.trader = trader;
        this.day = day;
        this.money = money;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", day=" + day +
                ", money=" + money +
                '}';
    }
}
