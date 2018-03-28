package singleton;

public class Atmosphere {

    private static Atmosphere mAtmosphere = new Atmosphere();

    private Atmosphere() {
    }

    public static Atmosphere getInstance() {
        return mAtmosphere;
    }

    void showMessage() {
        System.out.println("Hello from Atmosphere!");
    }
}
