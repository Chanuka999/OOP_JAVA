abstract class Shape{
    abstract double getArea();
    abstract double getPerameter();

}

class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    double getArea(){
        return width*height;
    }

    double getPerameter(){
        return 2 * (width+height);
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
       this.radius=radius;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }

    double getPerameter(){
        return 2 * Math.PI * radius;
    }
    
}

class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
     
     Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
     }

     double getArea(){
        double s = (side1+side2+side3)/2;
         return Math.sqrt(s*(s-side1) * (s-side2) * (s-side3)); 
     }

     double getPerameter(){
        return side1+side2+side3;
     }
}



public class Q16{
    public static void main(String[] args){
        Shape rectangle = new Rectangle(10,12);

        Shape circle = new Circle(7);

        Shape triangle = new Triangle(4,6,5);

        System.out.println("******Rectangle*********");
        System.out.println("Area :" + rectangle.getArea());
         System.out.println("Perimeter :" + rectangle.getPerameter());


      System.out.println();
          System.out.println("******Circle*********");
        System.out.println("Area :" + circle.getArea());
         System.out.println("Perimeter :" + circle.getPerameter());

          System.out.println();
          System.out.println("******Triangle*********");
        System.out.println("Area :" + triangle.getArea());
         System.out.println("Perimeter :" + triangle.getPerameter());
    }
}