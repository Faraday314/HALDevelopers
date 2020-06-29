public class MyStaticClass {
    private MyStaticClass() {}

    public static boolean doesMyCarCrash(Car car) {
        return car instanceof BadCar;
    }

    public static void driveThisVehicle(Driveable driveable) {
        driveable.drive();
    }

    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
