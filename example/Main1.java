class Circle{
    private double radius;
    private String color;

    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
}

public class Main1{
    public static void main(String[] args){
        Circle circle = new Circle(1.0,"red");
        System.out.println("This circle radius is: "+ circle.getRadius() + " and Area is :" + circle.getArea());
    }
}