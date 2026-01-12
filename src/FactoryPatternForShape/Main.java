package FactoryPatternForShape;
public class Main {
    public static void main(String[] arg){
        ShapeFactory factory ;
        factory = new CircleFactory();
        Shape circle = factory.createShape();
        circle.printShape();

        factory = new RectangleFactory();
        Shape rectangle = factory.createShape();
        rectangle.printShape();

        factory = new SquareFactory();
        Shape square = factory.createShape();
        square.printShape();

    }
}
