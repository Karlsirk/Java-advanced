package org.sda.model;

/**
 * Exercise-2
 *
 * @author Vinod John
 */
public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money <= 10 ? 0 : money;
    }

    public void setMoney(double money) {
        if (money < 0 || money > 3000) {
            System.out.println("I don’t have enough space in my pocket for as much money!”");
        } else {
            this.money = money;
        }
    }
}