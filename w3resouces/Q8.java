class TrafficLight{
    String color;
    int duration;

    TrafficLight(String color,int duration){
        this.color=color;
        this.duration=duration;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }

    int getDuration(){
        return duration;
    }
    void setDuration(int duration){
        this.duration=duration;
    }
    void ChangeColor(String newColor){
        color =newColor;
    }

    boolean isRed(){
        return color.equals("red");
    }
 
    boolean isGreen(){
        return color.equals("green");
    }

}
public class Q8{
    public static void main(String[] args){
        TrafficLight light = new TrafficLight("red",30);

        System.out.println("The light is red" + light.isRed());

         System.out.println("The light is green" + light.isGreen());
    }
}