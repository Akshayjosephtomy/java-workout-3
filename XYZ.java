class Faculty {
    int facultyid;
    double salary;
    Faculty(int id){
        facultyid = id ;
    }
    void display(){
        System.out.println("=========================");
        System.out.println("Faculty Id : "+ facultyid);
        System.out.println("Salary : "+ salary);
    }
}

class FullTimeFaculty extends Faculty{
    double basic,allowance;
    FullTimeFaculty(int id,double basic,double allowance) {
        super(id);
        this.basic = basic;
        this.allowance = allowance;
    }
    void salary(){
        this.salary = basic + allowance;
    }
}

class PartTimeFaculty extends Faculty{
    double hour,rate;
    PartTimeFaculty(int id,double hour,double rate) {
        super(id);
        this.hour = hour;
        this.rate = rate;
    }
    void salary(){
        this.salary = hour * rate;
    }
}

public class XYZ {
    public static void main(String[] args) { 
        FullTimeFaculty f1 = new FullTimeFaculty(1,10000,575.55);
        FullTimeFaculty f2 = new FullTimeFaculty(2,8000,460.05);
        PartTimeFaculty p1 = new PartTimeFaculty(3,8.5,600);
        PartTimeFaculty p2 = new PartTimeFaculty(64, 7, 500);
        f1.salary();
        f1.display();
        f2.salary();
        f2.display();
        p1.salary();
        p1.display();
        p2.salary();
        p2.display();
    }
}