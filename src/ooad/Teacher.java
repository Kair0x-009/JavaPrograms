package ooad;

public class Teacher extends Person{
    private String Department;

    public Teacher( String name,String address, String department) {
        super(address, name);
        Department = department;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Department='" + Department + '\'' +
                '}';
    }
}
