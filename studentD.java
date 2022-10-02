import java.util.Scanner;
class Student{
    public static Scanner sc = new Scanner(System.in);
    int rollno, percentage;
    Student(){
       rollno = sc.nextInt();
       percentage = sc.nextInt();
    }
    Student(int rollno,int percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show(){
        System.out.println("=======================");
        System.out.println("Rollno: "+ rollno);
        System.out.println("Percentage: "+ percentage);
    }
}
class SchoolStudent extends Student{
    int classname;
    SchoolStudent(){
        super();
        classname = sc.nextInt();
    }
    SchoolStudent(int rollno,int percentage,int classname){
        super(rollno, percentage);
        this.classname = classname;
    }
    void show(){
        super.show();
        System.out.println("Class :"+ classname);
    }
}
class CollegeStudent extends Student{
    int semster;
    CollegeStudent(){
        super();
        semster = sc.nextInt();
    }
    CollegeStudent(int rollno,int percentage,int semster){
        super(rollno, percentage);
        this.semster = semster;
    }
    void show(){
        super.show();
        System.out.println("Semster : "+semster);
    }
}

public class studentD{
    public static void main(String[] args) {
        CollegeStudent clg1 = new CollegeStudent(4,85,2);
        CollegeStudent clg2 = new CollegeStudent(20,75,5);
        SchoolStudent sch1 = new SchoolStudent(9,89,10);
        SchoolStudent sch2 = new SchoolStudent(15,95,10);
        SchoolStudent sch3 = new SchoolStudent(5,70,12);
        Student[] arr = {clg1,clg2,sch1,sch2,sch3};
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            
            arr[i].show();
            if(arr[i].percentage > 75){
                counter++;
            }
        }
        
        System.out.println("\nTotal no. of students having A grade : "+counter);
        System.out.println("\nEnter the roll no. :");
        int rollno = Student.sc.nextInt();
        int flag = 0;
        for(int i = 0; i < arr.length; i++){

            if( arr[i].rollno == rollno ){
                flag = 1;
                if( arr[i] instanceof CollegeStudent){
                    System.out.println("\nRollno "+rollno+ " is a college student");
                    break;
                }
                else{
                    System.out.println("\nRollno "+rollno+ " is a school student");
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("\nRollno not found");
        }
        
    }
}