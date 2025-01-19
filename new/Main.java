abstract class Player{
   private int PlayerId;
   private String name;
   private String country;
   private int[] scores;

   Player(int PlayerId,String name,String country,int[] scores){
    this.PlayerId=PlayerId;
    this.name=name;
    this.country=country;
    this.scores=scores;
   } 

   int getPlayerId(){
    return PlayerId;
   }

   String getName(){
    return name;
   }
   
   String country(){
    return country;
   }

   abstract void addScore(int score);

   abstract void printDetails();



}

class Batsman extends Player{
    
}