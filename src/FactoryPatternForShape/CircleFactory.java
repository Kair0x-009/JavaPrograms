package FactoryPatternForShape;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
