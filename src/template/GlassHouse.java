package template;

public class GlassHouse extends House {
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls.");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building glass pillars.");
    }
}
