//Class: CS 5000
//Term: Fall 2019
//Name: Ernst Fanfan
//Instructor: Dr. Haddad
//Assignment: 8
//IDE Name: IntelliJ

import java.text.DecimalFormat;
import java.util.Date;

public class Account{
    private int id = 0;//Account number
    private double balance = 0.0;//Account current balance
    private double annualInterestRate = 0;//Interest Rate
    private Date dateCreated;//Date created

    public Account() {//Non-Argument constructor
        dateCreated = new Date();
    }
    public Account(int id, double balance){//constructor
        this.id = id;//account ID
        this.balance = balance;//account balance
        dateCreated = new Date();//date created
    }

    //fetch methods
    public int getId(){return id;}//ID fetch
    public double getBalance(){return balance;}//current balance fetch
    public double getAnnualInterestRate(){return annualInterestRate;}//Interest rate fetch
    public String getDateCreated(){
        return dateCreated.toString();}//date fetch
    public double getMonthlyInterestRate(){//monthly rates fetch
        return ((annualInterestRate/12));
    }//monthly interest rate
    public double getMonthlyInterest(){
        return (balance*getMonthlyInterestRate());
    }//monthly calculate interest

    //set methods
    public void setId(int id){//set Id
        this.id = id;
    }//set ID
    public void setBalance(double balance){//set balance
        this.balance = balance;
    }//set starting balance
    public void setAnnualInterestRate(double annualInterestRate){//set rate
        this.annualInterestRate = annualInterestRate/100;
    }//set annual interest rate

    //mutator methods
    public void withdraw(double amount){
        balance = balance-amount;
    }//reduce balance
    public void deposit(double amount){
        balance =balance+amount;
    }//increase balance

    //to String method
    public String toString (){//relevant account info
        DecimalFormat dollar = new DecimalFormat("$###,##0.00");
        DecimalFormat percent = new DecimalFormat("#0.00%");
        return ("Account ID:\t \t \t \t"+id+"\nAccount Balance:\t \t"+dollar.format(balance)+"\nInterest Rate:\t \t \t"+percent.format(getAnnualInterestRate())+"\nDate Opened:\t \t \t"+getDateCreated());
    }
}
