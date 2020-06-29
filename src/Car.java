public abstract class Car implements Driveable, Honkable {
    static int numberOfCars = 0;
    protected String name;
    public Car(String name) {
        this.name = name;
        numberOfCars++;
    }

    @Override
    public final void honk() {
        System.out.println("Honk!");
    }

    public static void CrashCars(Car car1, Car car2) {
        System.out.println(car1.name + " crashed into "+car2.name);
    }
}
