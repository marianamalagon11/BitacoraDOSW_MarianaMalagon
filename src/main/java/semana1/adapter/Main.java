package semana1.adapter;

public class Main {
    public static void main(String[] args) {
        Printer simple = new Printer() {
            SimplePrinter printer = new SimplePrinter();
            @Override
            public void print(String message) {
                printer.print(message);
            }
        };

        DetailedPrinter detailed = new DetailedPrinter();
        Printer detailedAdapter = new DetailedPrinterAdapter(detailed, "Mariana", "2026-02-27");

        simple.print("Solo texto");
        detailedAdapter.print("Hola, mundo!");
    }
}
