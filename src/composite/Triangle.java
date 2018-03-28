package composite;

public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.printf("Drawing triangle with %s color.\n", color);
    }
}
