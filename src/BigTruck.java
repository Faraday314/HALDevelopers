@MyAnnotation
public class BigTruck implements Driveable, Honkable {
    @Override
    public void drive() {
        System.out.println("DRIVE SLOWLY BECAUSE HEAVY!");
    }

    @Override
    public void honk() {
        System.out.println("HONK! ALL CAPS!");
    }

    public void doHonk(Honkable honkable) {
        honkable.honk();
    }
}
