class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
    
}

public class Q4{
    public static void main(String[] args){
        Circle circle = new Circle(7);
        System.out.println(circle.getArea());
    }
}