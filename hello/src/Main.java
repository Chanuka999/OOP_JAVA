abstract class Employee{
    private String name;
    private int paymentPerHour;

    abstract int calculateSalary();
    Employee(String name,int paymentPerHour){
        this.name=name;
        this.paymentPerHour=paymentPerHour;
    }
    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    int getPaymentPerHour(){
        return paymentPerHour;
    }

    void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour=paymentPerHour;
    }
}

class Contractor extends Employee{
    private int workingHours;


    Contractor(String name,int paymentPerHour,int workingHours){
        super(name,paymentPerHour);
        this.workingHours=workingHours;
    }

    int getWorkingHours(){
        return workingHours;
    }
    void setWorkingHours(int workingHours){
        this.workingHours=workingHours;
    }
    @Override
    int calculateSalary(){
        return getPaymentPerHour() * workingHours;
    }
}

class FullTimeEmployee extends Employee{
    private int workingHours;

    FullTimeEmployee(String name,int paymentPerHour){
        super(name,paymentPerHour);

    }



    @Override
    int calculateSalary(){
        return getPaymentPerHour()*8;
    }
}

public class Main{
    public static void main(String[] args){
        Employee contractor = new Contractor("contractor",10,10);
        Employee fullTimeEmploye = new FullTimeEmployee("fulltimeemployee",8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmploye.calculateSalary());
    }
}