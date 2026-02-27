package semana1.solid;

public class Calculator {
    public double operate(Operation operation, double a, double b) {
        return operation.calculate(a, b);
    }
}
