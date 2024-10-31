import java.util.List;

public class PlainTextReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(List<Book> books) {
        StringBuilder report = new StringBuilder("Books Report:\n");
        for (Book book : books) {
            report.append(book.toString()).append("\n");
        }
        return report.toString();
    }
}
