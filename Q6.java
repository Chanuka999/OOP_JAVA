class Employee{
   private String name;
   private String jobTitle;
   private double salary;

   Employee(String name, String jobTitle,double salary){
    this.name=name;
    this.jobTitle=jobTitle;
    this.salary=salary;
   }

   String getName(){
    return name;
   }

   void setName(String name){
    this.name=name;
   }

   String getJobTitle(){
    return jobTitle;
   }

   void setJobTitle(String jobTitle){
    this.jobTitle=jobTitle;
   }

   double getSalary(){
      return salary;
   }

   void setSalary(double salary){
    this.salary=salary;
   }

   void calculateSalary(double persentage){
    salary = salary + salary*persentage/100;
   }

   public void printEmployeeDetails(){
    System.out.println("Name : " + name);
    System.out.println("job title :" + jobTitle);
    System.out.println("salary:" + salary);
   }
}
public class Q6{
    public static void main(String[] args){
        Employee employee1 = new Employee("chanuka","Software Engineer",150000);
        Employee employee2 = new Employee("saman","business",50000);

        System.out.println("\nEmployee Details");
        System.out.println();
        employee1.printEmployeeDetails();
          System.out.println();
        employee2.printEmployeeDetails();


         employee1.calculateSalary(8);
         employee2.calculateSalary(6);
          System.out.println("After presentage add to salary");
        System.out.println();
        System.out.println("\n8% for 'chanuka randitha'");
         employee1.printEmployeeDetails();
         System.out.println();
        System.out.println("\n6% for 'saman'");
         employee2.printEmployeeDetails();

         
     }
}