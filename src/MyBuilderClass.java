import java.util.ArrayList;
import java.util.List;

public class MyBuilderClass {
    private List<Double> values;

    public MyBuilderClass() {
        values = new ArrayList<>();
    }

    public MyBuilderClass addValue(double value) {
        values.add(value);
        return this;
    }

    public List<Double> build() {
        return values;
    }
}
