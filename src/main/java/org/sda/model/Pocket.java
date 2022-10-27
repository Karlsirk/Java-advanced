package org.sda.model;

/**
 * Exercise-2
 *
 * Create class Pocket.
 * a) Add field „money”, create constructor, getter and setter.
 * b) Add verification for both getter and setter. Getter should result in returning as much
 * money, as the user asked for. It should return 0 if money <= 10.
 * c) Setter should not accept values below 0 and greater than 3000. It may print a message
 * like „I don’t have enough space in my pocket for as much money!”
 *
 * @author Karl Sirkas
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