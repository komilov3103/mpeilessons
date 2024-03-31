package lesson2.homework;

public class BankAccount {

    private double money;

    public BankAccount(double money) {
        this.money = money;
    }

    public double checkMoney(){
        return money;
    }

    public void putMoney(double quantity){
        money += quantity;
    }

    public double withdrawMoney(){
        double current = money;
        money = 0;
        return current;
    }

    public double checkInDollars(){
        return money/ExchangeRates.getDollarRate();
    }

    public double checkInEuros(){
        return money/ExchangeRates.getEuroRate();
    }
}
