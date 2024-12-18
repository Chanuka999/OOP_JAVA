class Dog{
    private String name;
    private String breed;

    Dog(String name, String breed){
        this.name=name;
        this.breed = breed;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getBreed(){
        return breed;
    }

    void setBreed(String breed){
      this.breed=breed;
    }
}

public class Q2{
    public static void main(String[] args){
        Dog dog1 = new Dog("lasi","jurman seperd");
        Dog dog2 = new Dog("blacy","Bulldog");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        dog1.setBreed("Goldern Retriever");

        dog2.setName("Brown");

         System.out.println();
        System.out.println("change names and breed");
         System.out.println();

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
    }
}