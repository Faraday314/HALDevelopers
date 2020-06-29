@MyAnnotation(name = "joe")
public class BadCar extends Car {
    public BadCar() {
        super("bad car");
    }

    @Override
    public void drive() {
        System.out.println("Swerve and explode in flames!");
    }
}
