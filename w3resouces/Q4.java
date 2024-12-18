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
    double getCircumference(){
        return 2 * Math.PI * radius;
    }
    
}

public class Q4{
    public static void main(String[] args){

        double r;
        r=7;
        Circle circle = new Circle(r);

        System.out.println("Circle area is " + circle.getArea());
         System.out.println("Circle Circumference is " + circle.getCircumference());
        System.out.println();
         r=9;
         circle.setRadius(9);
          System.out.println("Circle area is " + circle.getArea());
         System.out.println("Circle Circumference is " + circle.getCircumference());

    }
}