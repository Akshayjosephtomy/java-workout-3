package p1;

public class Student {
    
    String studentName;
    int rollNo;
    public Student(String stud,int roll){
        studentName = stud;
        rollNo = roll;
    }
    public void getStudent(){
        System.out.println("package 1");
        System.out.println("Student Roll No. is " + rollNo);
        System.out.println("Student Name is " + studentName);
    }
}
