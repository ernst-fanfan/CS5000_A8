
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
    }

    //Test Rectangle methods
    public static void testMethods(Rectangle rectangle){
        System.out.println(rectangle.getName()+":");
        System.out.println("-------------");
        System.out.printf("Width:\t \t"+"%.2f%n",rectangle.getWidth());
        System.out.printf("Height:\t \t"+"%.2f%n",rectangle.getHeight());
        System.out.printf("Area:\t \t"+"%.2f%n",rectangle.getArea());
        System.out.printf("Perimeter:\t"+"%.2f%n",rectangle.getPerimeter());
        System.out.println();
    }
}
