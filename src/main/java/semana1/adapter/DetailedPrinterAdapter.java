package semana1.adapter;

public class DetailedPrinterAdapter implements Printer {
    private DetailedPrinter detailedPrinter;
    private String author;
    private String date;

    public DetailedPrinterAdapter(DetailedPrinter detailedPrinter, String author, String date) {
        this.detailedPrinter = detailedPrinter;
        this.author = author;
        this.date = date;
    }

    @Override
    public void print(String message) {
        detailedPrinter.printDetails(message, author, date);
    }
}
