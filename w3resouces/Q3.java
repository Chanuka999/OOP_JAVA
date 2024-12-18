class Rectangle{
    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width=width;
    }

    double getHeight(){
        return height;
    }

    void setHeight(double height){
        this.height=height;
    }
    double getArea(){
        return height * width;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }
}

public class Q3{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(7.0,6.0);
        System.out.println("Rectangle area is " + rectangle.getArea());
         System.out.println("Rectangle perimeter is " + rectangle.getPerimeter());
    }
}