package ooad;

public class Main {
    public static void main(String[] args) {
        calc_area(10 ,20);
        calc_perimeter(10,20);

    }
    public static void calc_area(float length , float breadth) {
        System.out.println("AREA of Rectangle is: " + (length * breadth) + " sq.cm");
    }
    public static void calc_perimeter(float length , float breadth) {
        System.out.println("Perimeter of Rectangle is: " + 2*(length + breadth));
    }
}
