package semana2.solid;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Suma: " + calc.operate(new Addition(), 10, 5));
        System.out.println("Resta: " + calc.operate(new Subtraction(), 10, 5));
        System.out.println("Multiplicación: " + calc.operate(new Multiplication(), 10, 5));
        System.out.println("División: " + calc.operate(new Division(), 10, 5));
    }
}