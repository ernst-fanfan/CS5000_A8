public class Rectangle {
    private String name;
    private double width = 2.00;
    private double height = 2.00;

    public Rectangle(){}//non arguments constructor
    public Rectangle(String name, double with, double height){//constructor with arguments
        this.name = name;
        this.width = with;
        this.height = height;
    }

    //Get methods
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

    public String toString(){//passes relevant info about rectangle
        return "Rectangle "+name+" is "+width+" units wide and "+height+" units high.";
    }
}
