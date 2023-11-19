package com.teachmeskills.homeWork_6.Ex_1;
/*Задача 1
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Создайте один конструктор с двумя параметрами.
Добавьте метод, который позволяет начислять сумму на кредитную карточку. Метод принимает на вход сумму и добавляет эту сумму к текущей.
Подуймайте, как стоит задать входные и выходные параметры метода.
Добавьте метод, который позволяет снимать с карточки некоторую сумму. Метод принимает на вход сумму и отнимает эту сумму от текущей.
Подуймайте, как стоит задать входные и выходные параметры метода.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.

 */

import java.util.Objects;

public class CreditCard {
    String accountNumber;
    int accountBalance;

    public CreditCard(String accountNumber, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void addMoney(String cardNumber, int money){
        if (Objects.equals(cardNumber, accountNumber)){
            accountBalance = accountBalance + money;
            System.out.println(money + " successfully added to the account. Total balance: " + accountBalance);
        }
        else{
            System.out.println("There is no account with this number");
        }
    }
    public void withdrawMoney(String cardNumber, int money) {
        if (Objects.equals(cardNumber, accountNumber)) {
            if (money <= accountBalance) {
                accountBalance = accountBalance - money;
                System.out.println(money + " successfully withdrawn from your account. Your current balance: " + accountBalance);
            } else {
                System.out.println("Not enough money in your account");
            }
        }
        else {
            System.out.println("There is no account with this number");
        }
    }
    public void creditCardInfo(){
        System.out.println("Account number of current user: " + accountNumber);
        System.out.println("Account balance of current user: " + accountBalance);
    }
}
