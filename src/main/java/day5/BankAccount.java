package day5;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;

        if(initialBalance < 0 ){
            System.out.println("Initial balance cannot be negative. Setting balance to 0. ");
        }
        balance = initialBalance;

    }
    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
        }

    }

    //get
    public double getBalance()
    {
        System.out.println("Your balance is: " + balance);
        return balance;

    }

/*
Create a Student class with:
Private attributes: name , grade
public getter for name
public setter for grade , but only allows values between 0-100.
*/
}

