package HospitalManagementSystem;

public class Main {
    public static void main(String[] arr){
        Doctor D1 = new Doctor("password" ,2,"Doctor1","abc",
                "MBBS", "Night" , "xyz" );
        Doctor D2 = new Doctor("password" ,2,"Doctor1","abc",
                "MBBS", "Night" , "xyz" );
        Patient pat = new Patient("password",1,"patient1","AUS",
                18,"9844199151");
        D1.changeQualification("MD");
        D1.changeShift("Day");
        D1.printDetails();

        pat.changeAge(19);
        pat.changeContact("98555555");
        pat.assignDoctor(D2);
        pat.printDetails();
    }
}
