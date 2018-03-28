package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Atmosphere atmosphere = Atmosphere.getInstance();
        atmosphere.showMessage();
        System.out.println();
        LazyAtmosphere lazyAtmosphere = LazyAtmosphere.getInstance();
        lazyAtmosphere.showMessage();
    }
}
