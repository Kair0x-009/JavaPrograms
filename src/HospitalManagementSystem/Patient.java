package HospitalManagementSystem;

public class Patient extends User {
    private String role = "Patient";
    private  int age ;
    private  String address ;
    private String contact ;
    private Doctor doctor = null ;

    public Patient(String password , int user_id , String username ,String address, int age, String contact) {
        super(password , user_id , username);
        this.address = address;
        this.age = age;
        this.contact = contact;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public void changeContact(String contact) {
        this.contact = contact;
    }

    public void assignDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void printDetails(){
        System.out.println("User Id: " + user_id +" Username : "+ username + " Role : "+ role +
                " Age : "+ age + " Address :"+ address + " Contact :" + contact + " Doctor :" );
        doctor.printDetails();
    }
}
