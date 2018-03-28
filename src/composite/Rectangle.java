package composite;

public class Rectangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.printf("Drawing rectangle with %s color.\n", color);
    }
}
