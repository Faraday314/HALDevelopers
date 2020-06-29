public class SuperAwesomeCoolCar extends Car {
    public SuperAwesomeCoolCar() {
        super("cool car");
    }

    @Override
    public void drive() {
        System.out.println("Drive!");
    }

    @Override
    public String toString() {
        return name;
    }
}
