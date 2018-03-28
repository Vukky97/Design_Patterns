package template;

public class WoodenHouse extends House {
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls.");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building wooden pillars.");
    }

    @Override
    public void buildCustomDoor() {
        System.out.println("Building custom door.");
    }
}
