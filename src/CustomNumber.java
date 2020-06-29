import java.util.function.Function;

public class CustomNumber {
    public double number;

    public CustomNumber(double number) {
        this.number = number;
    }

    public double doOperation(Function<Double, Double> operation) {
        return operation.apply(number);
    }
}
