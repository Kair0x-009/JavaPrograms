package FactoryPatternForShape;

public class SquareFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
