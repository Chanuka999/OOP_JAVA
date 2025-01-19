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

  public int getPlayerId(){
    return PlayerId;
   }

  public String getName(){
    return name;
   }
   
  public String getCountry(){
    return country;
   }
   
   public int[] getScores(){
	   return scores;
   }

  public abstract void addScore(int score);

  public abstract void printDetails();



}

class Batsman extends Player{
    private int totalRuns;
	
	Batsman(int playerId,String name,String country,int[] scores){
		
		super(playerId,name,country,scores);
		for(int score : scores){
			this.totalRuns +=score;
		}
	}
	
	public int getTotalRuns(){
		return totalRuns;
	}
	
	@Override
	public void addScore(int score){
		if(score>=0 && score<=100){
			int[] newScores = new int[getScores().length + 1];
			System.arraycopy(getScores(), 0, newScores, 0, getScores().length);
			newScores[getScores().length] = score;
			totalRuns +=score;
		}
	}
	
	@Override
	public void printDetails(){
		System.out.println("Batsman Id :"+ getPlayerId());
		System.out.println("Batsman name :"+ getName());
		System.out.println("Batsman Id :"+ getCountry());
		System.out.print("Batsman Scores");
		for(int score: getScores()){
			System.out.print(score + " ");
		}
		System.out.println(" ");
		System.out.println("Batsman TotalRuns :"+ getTotalRuns());
	}
}

class Bowler extends Player{
	private int wickets;
	
	Bowler(int playerId,String name,String country,int[] scores){
		
		super(playerId,name,country,scores);
		for(int score:scores){
			this.wickets +=score;
		}
	}
	
	public int getWickets(){
		return wickets;
	}
	
	@Override
	public void addScore(int score){
		if(score>=0 && score<=10){
			int[] newScores = new int[getScores().length+1];
			System.arraycopy(getScores(),0,newScores,0,getScores().length);
			newScores[getScores().length] = score;
			wickets += score;
		}
	}
	
	@Override
	public void printDetails(){
		System.out.println("Bowler Id :"+ getPlayerId());
		System.out.println("Bowler name :"+ getName());
		System.out.println("Bowler Country :"+ getCountry());
		System.out.print("Bowler Scores");
		for(int score: getScores()){
			System.out.print(score + " ");
		}
		System.out.println(" ");
		System.out.println("Bowler TotalWickets :"+ getWickets());
	}
}

public class Main{
	public static void main(String[] args){
		
		Batsman[] batsman= {
			new Batsman(1,"Sachin Tendulkar", "India", new int[]{42, 0, 61, 15, 0, 100, 23,64,41,0,26}),
			new Batsman(2,"Virat Kohli", "India", new int[]{0, 25, 10, 60, 11, 0, 40, 11, 0, 2,0}),
            new Batsman(3,"MS Dhoni", "India", new int[]{6, 22, 48, 0, 11, 69, 0, 21, 19, 0,42}),
            new Batsman(4,"Ricky Ponting", "Australia", new int[]{11, 0, 28, 0, 64, 18, 45,26,0,11,0}),
			new Batsman(5,"Brian Lara", "West Indies", new int[]{0, 13, 21, 47, 0, 69, 17, 0,12,0,40}),
			
		};
		
		Bowler[] bowler = {
			new Bowler(1,"Muttiah Muralitharan", "Sri Lanka", new int[]{0, 10, 6, 8, 0, 1, 0,2,4,0,6}),
			new Bowler(2,"Shane Warne", "Australia", new int[]{6, 0, 1, 0, 2, 0, 4, 10, 0, 6,}),
			new Bowler(3,"Wasindu Hasaranga", "Sri Lanka", new int[]{0, 1, 0, 6, 8, 4, 2, 0,6,0,10}),
			new Bowler(4, "Glenn McGrath", "Australia", new int[]{4, 2, 6, 0, 10, 0, 1, 8, 6, 0,0}),
			new Bowler(5,"Dale Steyn", "South Africa", new int[]{0, 4, 0, 2, 1, 6, 10, 0, 8, 6,}),
			
		};
		
		System.out.println(" Batsman Details");
		
		for(Batsman batsmen: batsman){
			batsmen.printDetails();
			System.out.println(" ");
		}
		
		Batsman heightRun = batsman[0];
		for(Batsman batsmen : batsman){
			if(batsmen.getTotalRuns()>heightRun.getTotalRuns()){
			heightRun = batsmen;
			}
		}
		
		System.out.println("Heights run in Batsman");
		heightRun.printDetails();
		
		System.out.println(" ");
		
		System.out.println(" Bowler Details");
		
		
		for(Bowler bowlers: bowler){
			bowlers.printDetails();
			System.out.println(" ");
		}
		
		Bowler heightWicket = bowler[0];
		for(Bowler bowlers : bowler){
			if(bowlers.getWickets()>heightWicket.getWickets()){
			heightWicket = bowlers ;
			}
		}
		
		System.out.println("Heights wicket in Bowler");
		heightWicket.printDetails();
		
		batsman[0].addScore(14);
		System.out.println(" ");
		
		System.out.println("Players From Australia");
		System.out.println("Batsman of australia");
		for(Batsman batsmen: batsman){
			if("Australia".equals(batsmen.getCountry())){
				batsmen.printDetails();
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Bowler of australia");
		for(Bowler bowlers : bowler){
			if("Australia".equals(bowlers.getCountry())){
				bowlers.printDetails();
			}
		}
	}
}