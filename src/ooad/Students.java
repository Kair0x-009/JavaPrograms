package ooad;

public class Students extends Person{
    private String course ;

    public Students(String name , String address ,String course) {
        super(name , address);
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() +
                "course='" + course + '\'' +
                '}';
    }
}
