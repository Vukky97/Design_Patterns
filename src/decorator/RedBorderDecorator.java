package decorator;

public class RedBorderDecorator extends ShapeDecorator {
    RedBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Setting red border color.");
    }
}
