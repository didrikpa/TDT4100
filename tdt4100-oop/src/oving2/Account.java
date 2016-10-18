package oving2;

/**
 * Created by didrikpa on 06.06.2016.
 */
public class Account {

    protected double balance;
    protected double interest;

    public Account(double balance, double interest){
        if(balance > 0 && interest > 0){
            this.balance = balance;
            this.interest = interest;

        }
        else throw new IllegalArgumentException();
    }

    protected double getBalance(){
        return this.balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }

    protected double getInterestRate(){
        return this.interest;
    }

    protected void setInterestRate(double interest){
        if (interest > 0){
            this.interest = interest;
        }
        else throw new IllegalArgumentException();
    }

    protected void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else throw new IllegalArgumentException();

    }

    protected void withdraw(double amount){
        if (amount < balance && amount > 0){
            balance -= amount;
        }
        else throw new IllegalStateException();

    }
}
