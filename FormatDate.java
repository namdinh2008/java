import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String formattedDate = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("Today is: " + formattedDate);
    }
}
