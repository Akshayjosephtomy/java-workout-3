class InvalidFeeException extends Exception{

    InvalidFeeException(){
        super();
    }

}
interface StduentFee{

    void getFee() throws InvalidFeeException;

}
class Student implements StduentFee {

    int fees;
    String name;


    Student(int fees, String name) {
        this.fees = fees;
        this.name = name;
        try {
            if(fees<0)
            this.getFee();
            System.out.println("Success");
        } catch (InvalidFeeException e) {
            System.out.println("Entered negative value");
        }
    }
    public void getFee() throws InvalidFeeException {
        
        if(fees<0)
        throw new InvalidFeeException();

    }
    
}
class studentFeeD{

    public static void main(String[] args) {
        
        Student st = new Student(-2,"Akshay");
        
    }
}