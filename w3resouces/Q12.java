import java.time.LocalTime;

class Airplane{
    private String flightNumber;
    private String destination;
    private LocalTime depactureTime;
    private int delayTime;

    Airplane(String flightNumber,String destination,LocalTime depactureTime){
        this.flightNumber=flightNumber;
        this.destination = destination;
        this.depactureTime = depactureTime;
        this.delayTime =0;
    }

    String getFlightNumber(){
        return flightNumber;
    }

    void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }

    String getDestination(){
        return destination;
    }

    void setDestination(String destination){
        this.destination=destination;
    }

    LocalTime getDeparctureTime(){
        return depactureTime;
    }

    void setDeparctureTime(LocalTime depactureTime){
        this.depactureTime=depactureTime;
    }

    int getDelayTime(){
        return delayTime;
    }

    void delay(int minute){
         this.delayTime=minute;
         this.depactureTime = depactureTime.plusMinutes(minute);
    }

    void check_status(){
        if(delayTime ==0){
            System.out.println("Flight " + flightNumber + " on time ");
        }else{
            System.out.println("flight " + flightNumber + " is delayed by " + delayTime + " minutes");
        }
    }
}

public class Q12{
    public static void main(String[] args){
        Airplane airplane1 = new Airplane("ABC110", "Sri lanka", LocalTime.of(10,30));
         Airplane airplane2 = new Airplane("CFC115", "New york", LocalTime.of(11,20));
          Airplane airplane3 = new Airplane("BBC119", "mumbai", LocalTime.of(17,40));

        airplane1.check_status(); 
        airplane2.check_status(); 
        airplane3.check_status(); 

        airplane1.delay(30);
        airplane3.delay(50);

         System.out.println("");
        System.out.println("Current flight status :");
       
       airplane1.check_status();
       airplane3.check_status(); 
    }
}