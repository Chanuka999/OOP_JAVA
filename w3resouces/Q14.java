import java.util.ArrayList;

class School{
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<SchoolClass> classes;

    School(){
      this.students = new ArrayList<Student>();
      this.teachers = new ArrayList<Teacher>();
      this.classes = new ArrayList<SchoolClass>();
    }

    void addStudent(Student student){
        students.add(student);
    }

    void removeStudent(Student student){
        students.remove(student);
    }

     void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    void removeStudent(Teacher teacher){
        teachers.remove(teacher);
    }

    void addSchoolClass(SchoolClass schoolClass){
        classes.add(schoolClass);
    }

    void removeSchoolClass(SchoolClass schoolClass){
        classes.remove(schoolClass);
    }

    ArrayList<Student> getStudents(){
        return students;
    }

    ArrayList<Teacher> getTeachers(){
        return teachers;
    }

    ArrayList<SchoolClass> getClasses(){
        return classes;
    }


}

class Student{
    private String studentName;
    private int studentAge;

    Student(String studentName,int studentAge){
        this.studentName=studentName;
        this.studentAge = studentAge;
    }

    String getStudentName(){
        return studentName;
    }

    void setStudentName(String studentName){
        this.studentName=studentName;
    }

    int getStudentAge(){
        return studentAge;
    }

    void setStudentAge(int studentAge){
        this.studentAge=studentAge;
    }
}

class Teacher{
    private String teacherName;
    private String subject;

    Teacher(String teacherName,String subject){
        this.teacherName=teacherName;
        this.subject=subject;
    }

    String getTeacherName(){
        return teacherName;
    }
    void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    String getSubject(){
        return subject;
    }

    void setSubject(String subject){
        this.subject=subject;
    }
}

class SchoolClass{
    private String className;
    private Teacher teacher;
    private ArrayList<Student> students;

    SchoolClass(String className,Teacher teacher){
        this.className=className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    String getClassName(){
        return className;
    }

    void setClassName(String className){
        this.className=className;
    }

    Teacher getTeacher(){
        return teacher;
    }
    void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }

    ArrayList<Student> getStudents(){
        return students;
    }

    void addStudent(Student student){
        students.add(student);
    }

    void removeStudent(Student student){
        students.remove(student);
    }
}

public class Q14{
    public static void main(String[] args){
        School school = new School();

        Student student1 = new Student("chanuka",23);
         Student student2 = new Student("kamal",20);
          Student student3 = new Student("perera",25);
          Student student4 = new Student("sunil",22);

          school.addStudent(student1);
           school.addStudent(student2);
            school.addStudent(student3);
             school.addStudent(student4);

           Teacher teacher1 = new Teacher("udara","IT");
            Teacher teacher2 = new Teacher("sirisena","maths");
            Teacher teacher3 = new Teacher("subasinghe","science"); 

        school.addTeacher(teacher1);
         school.addTeacher(teacher2);
          school.addTeacher(teacher3);

          SchoolClass mathsClass = new SchoolClass("Mathmaics", teacher2);
          mathsClass.addStudent(student1);
          mathsClass.addStudent(student2);
          mathsClass.addStudent(student3);

           SchoolClass itClass = new SchoolClass("Infomation Technology", teacher1);
          mathsClass.addStudent(student1);
          mathsClass.addStudent(student3);
           mathsClass.addStudent(student4);

           SchoolClass scienceClass = new SchoolClass("science", teacher3);
          mathsClass.addStudent(student1);
          mathsClass.addStudent(student2);
         
           school.addSchoolClass(mathsClass);
           school.addSchoolClass(itClass);
           school.addSchoolClass(scienceClass);

           System.out.println("*********School information*********");
           System.out.println("Number of students : " + school.getStudents().size());
           System.out.println("Number of teachers : " + school.getTeachers().size());
           System.out.println("Number of classes : " + school.getClasses().size());
           


          System.out.println("\n***Math Class Information***");
          System.out.println("class name : " + mathsClass.getClassName());
          System.out.println("Teacher : " + mathsClass.getTeacher().getTeacherName());
          System.out.println("Number of Students : " + mathsClass.getStudents().size());





    }
}
