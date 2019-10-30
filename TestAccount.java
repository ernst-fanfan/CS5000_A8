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
                manipulate(myAccount);//process my account
            else if (choice == 2)
                manipulate(yourAccount);//process your account
        }
    }

    //data validation
    public static double datavalidation() {
        //init & Decl
        Scanner inputDouble = new Scanner(System.in);
        double number = 0;

        while (number <= 0) {//loop while number less than 0
            number = inputDouble.nextDouble();
            if (number <= 0)//error message
                System.out.println("\t \t Invalid entree!\n\t \tTry again:\t");
        }
        return number;
    }

    //options method prompt and scan for user choice
    private static int options(){
        //prompt
        System.out.println("Please from the following:\n\t1.\tSet ID\n\t2.\tSet Annual Interest Rate\n\t3.\tSet Balance" +
                "\n\t4.\tGet all available info\n\t5.\tWithdraw\n\t6.\tDeposit\n\t7.\tMain Menu");
        //Scanner init
        Scanner inputInt = new Scanner(System.in);
        int number = 0;//number init
        while (number < 1 || number > 7) {//loop while number is not in between 1 and 7
            number = inputInt.nextInt();//Scan
            if (number < 1 || number > 7)//error message
                System.out.println("\t \t Invalid entree!\n\t \tTry again:\t");
        }
        return number;
    }

    //manipulate rectangles
    public static void manipulate(Account account){
        //formatters
        DecimalFormat dollar = new DecimalFormat("$###,##0.00");//US Dollar formatter
        DecimalFormat percent = new DecimalFormat("#0.00%");//Percent formatter

        int option = 0;//Dec & Init
        while (option != 7){//interactive loop
            option = options();//pass user choice to option variable
            switch (option) {//process option
                case 1://test set ID
                    System.out.print("Chose and ID number:\t");
                    account.setId((int) (datavalidation()));
                    System.out.println(account);//toString
                    break;
                case 2://test Set Interest Rate
                    System.out.print("Set an Interest rate:\t");
                    account.setAnnualInterestRate(datavalidation());
                    System.out.println(account);//toString
                    break;
                case 3://test Set Balance
                    System.out.print("Set a starting balance:\t");
                    account.setBalance(datavalidation());
                    System.out.println(account);//toString
                    break;
                case 4://test all get function
                    System.out.println("Account ID:\t \t \t" + account.getId());
                    System.out.println("Annual Interest rate:\t" + percent.format(account.getAnnualInterestRate()));
                    System.out.println("Monthly Intrest Rate:\t" + percent.format(account.getMonthlyInterestRate()));
                    System.out.println("This months interest:\t" + dollar.format(account.getMonthlyInterest()));
                    System.out.println("Account Balance:\t \t" + dollar.format(account.getBalance()));
                    System.out.println("Date Created:\t \t \t" + account.getDateCreated());
                    System.out.println("********************");
                    System.out.println(account);//toString
                    break;
                case 5://test Withdraw
                    System.out.print("How much to withdraw:\t");
                    account.withdraw(datavalidation());
                    System.out.println(account);//toString
                    break;
                case 6://test Deposit
                    System.out.print("How uch to deposit:\t");
                    account.deposit(datavalidation());
                    System.out.println(account);//toString
                    break;
                case 7:
                    System.out.println("Main Menu");//return to main menu
            }
        }
    }
}
