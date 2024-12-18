abstract class Animal{
    private int legs;
    
    Animal(int legs){
        this.legs = legs;
    }

    int getLegs(){
        return legs;
    }

    void setLegs(int legs){
        this.legs=legs;
    }

    abstract void eat();

    void work(){
        System.out.println("animal walks on " + legs + " legs");
    }
}

class Spider extends Animal{
   
   Spider(){
    super(8);
   }


   
   @Override
   void eat(){
    System.out.println("The spider is eating");
   }
}

interface Pet{
     String getName();

   
    void setName(String name);
      

     void play();
}

class Cat extends Animal implements Pet{
    private String name;

    Cat(String name){
        super(4);
        this.name = name;
    }

    Cat(){
        this("");
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public void play(){
        System.out.println("the cat " + name + "is playing");
    }

    @Override
    public void eat(){
        System.out.println("The cat " + name + "is eating");
    }

}

class Fish extends Animal implements Pet{
    private String name;

    Fish(){
        super(0);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public void play(){
        System.out.println("The fish is swimmimg");
    }

    @Override
    public void work(){
        System.out.println("the fish can't work and don't have legs");
    }

    @Override
    public void eat(){
        System.out.println("the fish is eating");
    }
}

public class Main1{
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("fish");
        
        d.work();
        d.eat();

        System.out.println("\nCat");
        c.play();
        c.work();
        c.eat();

        System.out.println("\nSpider");
        e.eat();
        e.work();

        System.out.println("\nPolimopism");
        ((Fish) a).play();
        ((Cat) p).play(); 
        
        System.out.println("\nsuper class method");
        c.work();
    }
}