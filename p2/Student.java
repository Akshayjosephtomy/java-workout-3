package p2;

public class Student {
    
    String studentName;
    int rollNo;
    public Student(String stud,int roll){
        studentName = stud;
        rollNo = roll;
    }
    public void getStudent(){
        System.out.println("package 2");
        System.out.println("Student Roll No. is " + rollNo);
        System.out.println("Student Name is " + studentName);
    }
}
