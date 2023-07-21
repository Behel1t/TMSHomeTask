package org.example;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(11111111,5000);
        CreditCard card2 = new CreditCard(51122111,3524);
        CreditCard card3 = new CreditCard(22224786,500);
        card1.deposite(500);
        card2.deposite(1000);
        card3.withdraw(480);
        card1.getInfo();
        card2.getInfo();
        card3.getInfo();

    }
}
