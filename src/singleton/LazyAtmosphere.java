package singleton;

class LazyAtmosphere {
    private static LazyAtmosphere mLazyAtmosphere;

    // private constructor -> can't be instantiated
    private LazyAtmosphere() {
    }

    static LazyAtmosphere getInstance() {
        if (mLazyAtmosphere == null) {
            mLazyAtmosphere = new LazyAtmosphere();
        }
        return mLazyAtmosphere;
    }

    void showMessage() {
        System.out.println("Hello from LazyAtmosphere!");
    }
}
