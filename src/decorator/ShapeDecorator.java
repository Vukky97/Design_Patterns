package decorator;

public class ShapeDecorator implements Shape {

    private Shape mShape;

    public ShapeDecorator(Shape shape) {
        mShape = shape;
    }

    @Override
    public void draw() {
        mShape.draw();
    }
}
