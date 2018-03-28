package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();
        System.out.println();
        Shape redRectangle = new RedBorderDecorator(new Rectangle());
        redRectangle.draw();
        System.out.println();
        Shape circle = new Circle();
        circle.draw();
        System.out.println();
        Shape redCircle = new RedBorderDecorator(new Circle());
        redCircle.draw();
    }
}
