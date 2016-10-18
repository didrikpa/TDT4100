package oving1;

/**
 * Created by didrikpa on 03/05/16.
 */
public class Account {

    public double balance;
    public double interestRate;

/*    public Account(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }*/


    public void deposit(double sum){
        if(sum > 0){
            this.balance += sum;
        }

    }

    public void addInterest(){
        this.balance += (balance*interestRate)/100;

    }

    public String toString(){
        return balance+"";
    }

}
