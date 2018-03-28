package template;

public abstract class House {

    final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        buildCustomDoor();
        System.out.println("House is built.");
    }

    private void buildWindows() {
        System.out.println("Building glass windows.");
    }

    public void buildCustomDoor() {
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand.");
    }
}
