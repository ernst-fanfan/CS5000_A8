public class Account{
    private int id = 0;//Account number
    private double balance = 0.0;//Account current balance
    private static double annualInterestRate = 0;//Interest Rate
    private Date dateCreated;//Date created

    public Account() {//Non-Argument constructor
        java.util.Date date = new java.util.Date();
    }
    public Account(int id, double balance){//constructor
        this.id = id;
        this.balance = balance;
        java.util.Date date = new java.util.Date();
    }

    //fetch methods
    public int getId(){return id;}//ID fetch
    public double getBalance(){return balance;}//current balance fetch
    public double getAnnualInterestRate(){return annualInterestRate;}//Interest rate fetch
    public Date getDateCreated(){return dateCreated;}//date fetch
    public double getMonthlyInterestRate(){//monthly rates fetch
        return ((annualInterestRate/12)*100);
    }
    public double getMonthlyInterest(){
        return (balance*annualInterestRate);
    }

    //set methods
    public void setId(int id){//set Id
        this.id = id;
    }
    public void setBalance(double balance){//set balance
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){//set rate
        this.annualInterestRate = annualInterestRate;
    }

    //mutator methods
    public void withdraw(double amount){
        balance = balance-amount;
    }
    public void deposit(double amount){
        balance =balance+amount;
    }
}