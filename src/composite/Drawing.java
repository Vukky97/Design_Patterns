package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Shape shape : shapeList) {
            shape.draw(color);
        }
    }

    public void add(Shape shape) {
        shapeList.add(shape);
    }

    public void remove(Shape shape) {
        shapeList.remove(shape);
    }

    public void clear() {
        shapeList.clear();
        System.out.println("Drawings removed!");
    }
}
