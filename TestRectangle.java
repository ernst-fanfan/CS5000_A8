//Class: CS 5000
//Term: Fall 2019
//Name: Ernst Fanfan
//Instructor: Dr. Haddad
//Assignment: 8
//IDE Name: IntelliJ

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRectangle {
    public static void main (String [] args){
        //Init and Decl
        Rectangle myRectangle = new Rectangle();
        myRectangle.setName("myRectangle");
        Rectangle hisRectangle = new Rectangle("hisRectangle",5.0,10.0);
        Rectangle herRectangle = new Rectangle("herRectangle",5.75,12.50);

        //testing methods in class Rectangle
        testMethods(myRectangle);
        testMethods(hisRectangle);
        testMethods(herRectangle);

        //testing toString
        System.out.println(myRectangle.toString());
        System.out.println(hisRectangle.toString());
        System.out.println(herRectangle.toString());
        System.out.println();

        //interactive loop
        int choice = 0;
        Scanner inputInt = new Scanner(System.in);
        while (choice != 3){
            //prompt
            System.out.println("Chose an option:\n\t1.\tmyRectangle\n\t2.\thisRectangle\n\t3.\tExit");
            //Scan
            choice = inputInt.nextInt();
            //data validation
            if (choice < 1 || choice > 3)
                System.out.println("\t \tinvalid entree\n");
            else if(choice == 1)
                manipulate(myRectangle);
            else if (choice == 2)
                manipulate(hisRectangle);
        }
    }
    //data validation
    public static double datavalidation(){
        //init & Decl
        Scanner inputDouble = new Scanner(System.in);
        double number = 0;
        while (number <= 0){
         number = inputDouble.nextDouble();
         if (number <= 0)
             System.out.println("\t \t Invalid entree!\n\t \tTry again:\t");
        }
        return number;
    }

    //manipulate rectangles
    public static void manipulate(Rectangle rectangle){
        //set with
        System.out.println("Set width:\t");
        rectangle.setWidth(datavalidation());
        //set height
        System.out.println("Set height:\t");
        rectangle.setHeight(datavalidation());
        //call testmethods
        testMethods(rectangle);
        //display relevant inf about rectangle
        System.out.println(rectangle.toString());
    }

    //Test Rectangle methods
    public static void testMethods(Rectangle rectangle){
        DecimalFormat numFormat = new DecimalFormat("###,###,##0.00");
        System.out.println(rectangle.getName()+":");
        System.out.println("-------------");
        System.out.println("Width:\t \t"+numFormat.format(rectangle.getWidth()));
        System.out.println("Height:\t \t"+numFormat.format(rectangle.getHeight()));
        System.out.println("Area:\t \t"+numFormat.format(rectangle.getArea()));
        System.out.println("Perimeter:\t"+numFormat.format(rectangle.getPerimeter()));
        System.out.println();
    }
}
