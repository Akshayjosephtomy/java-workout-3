import p1.Student;
import p1.Faculty;
class Demo {

    public static void main(String[] args) {
        Faculty p1f = new Faculty(10,"Subhash");
        Student p1s = new Student("Akshay",6);

        p2.Faculty p2f = new p2.Faculty(17,"Rajan");
        p2.Student p2s = new p2.Student("Arun",12);

        p1f.getFaculty();
        p1s.getStudent();
        p2f.getFaculty();
        p2s.getStudent();
        
        
    }
    
}