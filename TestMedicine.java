class Medicine{
    String companyName,companyAddress;

    Medicine(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    void displayLabel(){
        System.out.println("Company name: "+ companyName);
        System.out.println("Company Address: "+companyAddress);
    }

}
class Tablet extends Medicine{

    String name;
    Tablet(String companyName, String companyAddress, String name) {
        super(companyName, companyAddress);
        this.name = name;
    }
    void displayLabel() {

        super.displayLabel();
        System.out.println("Tablet name: "+name);
        System.out.println("store in a cool dry place");
    }

}
class Syrup extends Medicine{

    String name;
    Syrup(String companyName, String companyAddress, String name) {
        super(companyName, companyAddress);
        this.name = name;
    }
    void displayLabel() {

        super.displayLabel();
        System.out.println("Syrup name: "+name);
        System.out.println("Store in a cool dry place");
    }

}
class Onintment extends Medicine{

    String name;
    Onintment(String companyName, String companyAddress, String name) {
        super(companyName, companyAddress);
        this.name = name;
    }
    void displayLabel() {

        super.displayLabel();
        System.out.println("Onintment name: "+name);
        System.out.println("External use only");
    }

}
public class TestMedicine {
    public static void main(String[] args) {
        int random;
        for (int i = 0;i<3; i++) {
            
            random = (int)((Math.random() * (3 - 1 + 1)) + 1) ;
            System.out.println(random);
            
            switch (random) {
                case 1:
                        Tablet t = new Tablet("leksmi pharma","gujarath","paracetamol");
                        t.displayLabel();
                        continue;
                case 2:
                        Syrup sy = new Syrup("medall","mumbai","naproxen");
                        sy.displayLabel();
                        continue;
                case 3:
                        Onintment onint = new Onintment("oily","cochin","betadin");
                        onint.displayLabel();
                        continue;
            }
        }
        
    }
}