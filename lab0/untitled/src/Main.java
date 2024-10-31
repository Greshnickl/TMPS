import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book("1984", "George Orwell"));

        ReportGenerator textReport = new PlainTextReportGenerator();
        ReportGenerator jsonReport = new JsonReportGenerator();

        System.out.println("Plain Text Report:");
        System.out.println(textReport.generateReport(books));

        System.out.println("\nJSON Report:");
        System.out.println(jsonReport.generateReport(books));
    }
}
