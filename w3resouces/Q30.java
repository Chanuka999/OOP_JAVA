class GymMembership{
    private String memberName;
    private String membershipType;
    private int duration;

    GymMembership(String memberName,String membershipType,int duration){
        this.memberName=memberName;
        this.membershipType=membershipType;
        this.duration=duration;

    }
    int getDuration(){
        return duration; 
    }
     public double calculateFess(){
           double baseFee = 50.0;
           return baseFee * duration;
     }
       public String checkSpecialOffers() {
        if (membershipType.equalsIgnoreCase("annual")) {
            return "10% discount on annual membership.";
        } else {
            return "No special offers available.";
        }
    }

 public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + calculateFess());
        System.out.println("Special Offers: " + checkSpecialOffers());
    }
    
}

class PremiumMemberShip extends GymMembership{
    boolean personalTrainerAvailable;
    boolean spaAccess;

    public PremiumMemberShip(String memberName,String membershipType,int duration,boolean personalTrainerAvailable,boolean spaAccess){
        super(memberName,membershipType,duration);
        this.personalTrainerAvailable=personalTrainerAvailable;
        this.spaAccess=spaAccess;
    }

    @Override
    public double calculateFess(){
        double baseFee = super.calculateFess();
        double additionalFee = 0.0;

        if(personalTrainerAvailable){
            additionalFee += 30.0 * getDuration();

        }
        if(spaAccess){
            additionalFee += 20.0 * getDuration();
        }
        return baseFee + additionalFee;
    }
     @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer Available: " + (personalTrainerAvailable ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }

}
public class Q30 {
    public static void main(String[] args) {
        
        GymMembership basicMember = new GymMembership("Njeri Inka", "Monthly", 6);

     
        PremiumMemberShip premiumMember = new PremiumMemberShip("Willy Diantha", "Annual", 12, true, true);

      
        System.out.println("Basic Membership Details:");
        basicMember.displayDetails();

        
        System.out.println("\nPremium Membership Details:");
        premiumMember.displayDetails();
    }
}
