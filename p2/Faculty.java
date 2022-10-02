package p2;

public class Faculty {
    
    int facultyNo;
    String facultyName;
    public Faculty(int no, String name){
        facultyNo = no;
        facultyName = name;
    }
    public void getFaculty(){
        System.out.println("package 1");
        System.out.println("faculty no. is "+ facultyNo);
        System.out.println("Faculty Name is "+ facultyName);
    }
}