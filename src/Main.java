import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println(Car.numberOfCars);
        BadCar car = new BadCar();
        System.out.println(Car.numberOfCars);
        SuperAwesomeCoolCar car2 = new SuperAwesomeCoolCar();
        System.out.println(Car.numberOfCars);
*/

        BadCar truck = CarFactory.createBadCar();

        if(truck.getClass().isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = truck.getClass().getAnnotation(MyAnnotation.class);
            //System.out.println(annotation.name());
        }

        MyBuilderClass builder = new MyBuilderClass();

        System.out.println(
        builder
                .addValue(1)
                .addValue(2)
                .addValue(3)
                .addValue(4)
                .addValue(5)
                .addValue(6)
                .build()
        );


        MySingletonClass instance1 = MySingletonClass.getInstance();
        System.out.println(instance1.number);
        instance1.number = 12;
        MySingletonClass instance2 = MySingletonClass.getInstance();
        System.out.println(instance2.number);

        SuperAwesomeCoolCar car5 = new SuperAwesomeCoolCar();

        System.out.println(car5);


        Function<Double, Double> myFunction = (Double value) -> {
            value++;
            value *= 2;
            return value;
        };

        System.out.println(myFunction.apply(5.0));

        CustomNumber number1 = new CustomNumber(1);
        double numberPlus1 = number1.doOperation(myFunction);
        System.out.println(numberPlus1);
    }


}
