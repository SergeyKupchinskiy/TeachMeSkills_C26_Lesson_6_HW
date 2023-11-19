package com.teachmeskills.homeWork_6.Ex_1;

public class Client {
    public static void main(String[] args) {
        CreditCard alexander = new CreditCard("3243 5465 7687 9800", 44000);
        CreditCard juriy = new CreditCard("1324 3546 5768 7980",108000);
        CreditCard oxana = new CreditCard("2132 4354 6576 8798", 66000);

        alexander.addMoney("3243 5465 7687 9800", 35000);
        alexander.creditCardInfo();

        juriy.addMoney("1324 3546 5768 7980", 2500);
        juriy.creditCardInfo();

        oxana.withdrawMoney("2132 4354 6576 8798", 28000);
        oxana.creditCardInfo();

    }
}
