import java.util.ArrayList;

class Student{
    private String name;
    private String grade;
    private ArrayList courses;

    Student(String name,String grade,ArrayList courses){
        this.name=name;
        this.grade=grade;
        this.courses = new ArrayList();

    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getGrade(){
        return grade;
    }

    void setGrade(String grade){
        this.grade=grade;
    }

    ArrayList getCourses(){
        return courses;
    }
    void addCourse(String course){
        courses.add(course);
    }

    void removeCourses(String course){
        courses.remove(course);
    }

    void printStudentsDetails(){
        System.out.println("Name:" + name);

        System.out.println("Grade:" + grade);
    }
}
public class Q10{
    public static void main(String[] args){
        Student student1 = new Student("chanuka","12B");

        student1.printStudentsDetails();


    }
}