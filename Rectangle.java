import java.text.DateFormat;
import java.text.DecimalFormat;

public class Rectangle {
    private String name;
    private double width = 2.00;
    private double height = 2.00;
    DecimalFormat numFormat = new DecimalFormat("###,###,##0.00");

    public Rectangle(){}//non arguments constructor
    public Rectangle(String name, double with, double height){//constructor with arguments
        this.name = name;
        this.width = with;
        this.height = height;
    }

    //Get methods
    public String getName() {
        return name;
    }
    public double getHeight() {//passes height
        return height;
    }
    public double getWidth() {//passes width
        return width;
    }
    public double getArea(){//passes area of rectangle
        return height*width;
    }
    public double getPerimeter(){//passes perimeter of rectangle
        return 2*(height+width);
    }

    //set methods
    public void setName(String name){//to set name to make it easier for the toString later on
        this.name = name;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public String toString(){//passes relevant info about rectangle
        return "Rectangle "+name+" is "+numFormat.format(width)+" units wide and "+numFormat.format(height)+" units high.";
    }
}
