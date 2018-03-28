package template;

public class TemplateMain {
    public static void main(String[] args) {
        House house = new WoodenHouse();
        house.buildHouse();
        System.out.println();
        house = new GlassHouse();
        house.buildHouse();
    }
}
