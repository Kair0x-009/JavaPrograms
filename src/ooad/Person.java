package ooad;

public class Person {
    private String name ;
    private String address ;

    public Person(String address, String name) {
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
