package composite;

public class CompositeMain {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Triangle());
        drawing.add(new Rectangle());
        drawing.draw("green");
        drawing.clear();
        drawing.add(new Triangle());
        drawing.draw("purple");
    }
}
