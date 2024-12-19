import java.time.LocalDate;
import java.time.Period;

class Employee{
   private String name;
   private double salary;
   private LocalDate hire_date;


    Employee(String name,double salary,LocalDate hire_date){
        this.name=name;
        this.salary=salary;
        this.hire_date=hire_date;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    double getSalary(){
       return salary;
    }

    void setSalary(double salary){
        this.salary=salary;
    }
    LocalDate getHire_date(){
        return hire_date;
    }
    void setHire_date(LocalDate hire_date){
        this.hire_date=hire_date;
    }
    int getYearsService(){
        return Period.between(hire_date,LocalDate.now()).getYears();
    }
    void printEmployeeDetails(){
        System.out.println("\nName :" + name);

        System.out.println("Salary :" + salary);

        System.out.println("Hire Date :" + hire_date);
    }
}

public class Q9{
    public static void main(String[] args){
        Employee employee = new Employee("chanuka randitha", 65000, LocalDate.parse("2020-03-09"));

        employee.printEmployeeDetails();
        System.out.println("Years of services :" + employee.getYearsService());


    }
}