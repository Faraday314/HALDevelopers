public class MySingletonClass {
    private static final MySingletonClass INSTANCE = new MySingletonClass();


    public int number = 5;
    private MySingletonClass() {}

    public static MySingletonClass getInstance() {
        return INSTANCE;
    }
}
