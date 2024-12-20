class Author{
    private String name;
    private String email;
    private String gender;

    Author(String name,String email,String gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getEmail(){
        return email;
    }

    void setEmail(String email){
        this.email=email;
    }
    String getGender(){
        return gender;
    }
    void setGender(String gender){
        this.gender=gender;
    }
    void PrintDetails(){
        System.out.println("Name :" + name); 
         System.out.println("Email :" + email); 
          System.out.println("Gender :" + gender); 
    }

}


public class Main2{
    public static void main(String[] args){
        Author author = new Author("chanuka","chanuka23@gmail.com","M");

        System.out.println(author.toString());
        author.PrintDetails();
    }
}