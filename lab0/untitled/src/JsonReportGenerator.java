import java.util.List;

public class JsonReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(List<Book> books) {
        StringBuilder report = new StringBuilder("{ \"books\": [\n");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            report.append("  { \"title\": \"").append(book.getTitle())
                    .append("\", \"author\": \"").append(book.getAuthor()).append("\" }");
            if (i < books.size() - 1) {
                report.append(",");
            }
            report.append("\n");
        }
        report.append("] }");
        return report.toString();
    }
}
