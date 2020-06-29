public class CarFactory {
    private CarFactory() {}

    public static SuperAwesomeCoolCar createCoolCar() {
        return new SuperAwesomeCoolCar();
    }

    public static BadCar createBadCar() {
        return new BadCar();
    }
}
