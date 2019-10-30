import java.text.DecimalFormat;
import java.util.Scanner;

public class TestAccount {
    public static void main (String[] Args){
        //formatters
        DecimalFormat dollar = new DecimalFormat("$###,##0.00");//US Dollar formatter
        DecimalFormat percent = new DecimalFormat("#0.00%");//Percent formatter

        //test object
        Account myObject = new Account(123456,10000.00);//Decl and Init an Account
        myObject.setAnnualInterestRate(2.5);//set annual interest rate
        myObject.withdraw(3500);// withdraw
        myObject.deposit(500);//deposit

        //test class methods
        System.out.println(dollar.format(myObject.getBalance()));//test getBalance
        System.out.println(dollar.format(myObject.getMonthlyInterest()));//test getMonthlyInterest
        System.out.println(myObject.getDateCreated());//test getDateCreated
        System.out.println("\n"+myObject);//test toString

        //todo add interactive loop
        //Init & Decl
        Account myAccount = new Account();
        Account yourAccount = new Account();
        Scanner inputInt = new Scanner(System.in);
        int choice = 0;

        while (choice != 3){//sentinel
            //prompt
            System.out.println("\nChose an option:\n\t1.\tmyAccount\n\t2.\tyourAccount\n\t3.\tExit");
            //Scan
            choice = inputInt.nextInt();
            //data validation
            if (choice < 1 || choice > 3)
                System.out.println("\t \tinvalid entree\n");
            else if(choice == 1)
                manipulate(myAccount);
            else if (choice == 2)
                manipulate(yourAccount);
        }
    }

    //data validation
    public static double datavalidation() {
        //init & Decl
        Scanner inputDouble = new Scanner(System.in);
        double number = 0;
        while (number <= 0) {
            number = inputDouble.nextDouble();
            if (number <= 0)
                System.out.println("\t \t Invalid entree!\n\t \tTry again:\t");
        }
        return number;
    }

    //manipulate rectangles
    public static void manipulate(Account account){
        int option = 0;
        while (option != 7){
            option = 7;
            switch (option) {
                case 1:
                    account.setId((int) (datavalidation()));
                    System.out.println(account);
                    break;
                case 2:
                    account.setAnnualInterestRate(datavalidation());
                    System.out.println(account);
                    break;
                case 3:
                    account.setBalance(datavalidation());
                    System.out.println(account);
                    break;
                case 4:
                    System.out.println("Account ID:\t" + account.getId());
                    System.out.println("Annual Interest rate:\t" + account.getAnnualInterestRate());
                    System.out.println("Monthly Intrest Rate:\t" + account.getMonthlyInterestRate());
                    System.out.println("This months interest:\t" + account.getMonthlyInterest());
                    System.out.println("Account Balance:\t" + account.getBalance());
                    System.out.println("Date Created:\t" + account.getDateCreated());
                    System.out.println("********************");
                    System.out.println(account);
                    break;
                case 5:
                    System.out.println("How much to withdraw:\t");
                    account.withdraw(datavalidation());
                    System.out.println(account);
                    break;
                case 6:
                    System.out.println("How uch to deposit:\t");
                    account.deposit(datavalidation());
                    System.out.println(account);
                    break;
                case 7:
                    System.out.println("Main Menu");
            }
        }
    }
}
