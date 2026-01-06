package HospitalManagementSystem;

public class Doctor extends User{
    private String role = "Doctor";
    private String department;
    private String speciality ;
    private String qualification;
    private String shift;

    public Doctor(String password, int user_id, String username, String department, String qualification, String shift, String speciality) {
        super(password, user_id, username);
        this.department = department;
        this.qualification = qualification;
        this.shift = shift;
        this.speciality = speciality;
    }

    public void changeQualification(String qualification){
        this.qualification = qualification ;
    }
    public void changeShift(String shift){
        this.shift = shift;
    }

    public void printDetails(){
        System.out.println("User Id" + user_id +" Username : "+ username + "Role :"+ role +
                "Department : "+ department + "Speciality :"+ speciality + "Qualification :" + qualification +
                "Shift :" + shift);
    }



}
