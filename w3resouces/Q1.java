class person{
    private String name;
    private int age;

    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age=age;
    }
}

public class Q1{
    public static void main(String[] args){
        person p1 = new person("chanuka",23);
        person p2 = new person("randitha",19);

        System.out.println(p1.getName() + " is " + p1.getAge() + " years old");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old");

        p1.setAge(24);

        p2.setName("kamal");
        p2.setAge(20);

        System.out.println();
        System.out.println("change new name and age");
         System.out.println();
         System.out.println(p1.getName() + " is " + p1.getAge() + " years old");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old");
     
    }
}