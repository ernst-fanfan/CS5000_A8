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
        int choice = 0;
        Scanner inputInt = new Scanner(System.in);
        while (choice != 3){
            //prompt
            System.out.println("Chose an option:\n\t1.\tmyAccount\n\t2.\tyourAccount\n\t3.\tExit");
            //Scan
            choice = inputInt.nextInt();
            //data validation
            if (choice < 1 || choice > 3)
                System.out.println("\t \tinvalid entree\n");
            else if(choice == 1)
                //manipulate(myRectangle);
            else if (choice == 2)
                //manipulate(hisRectangle);
        }
    }
}
