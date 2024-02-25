import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            LocalDateTime dateTime = parseDateTime(scanner);
            printUpdatedDate(dateTime);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date-time format. Please use the format: 'yyyy-MM-ddTHH:mm'");
        } finally {
            scanner.close();
        }
    }

    private static LocalDateTime parseDateTime(Scanner scanner) {
        return LocalDateTime.parse(scanner.nextLine());
    }

    private static void printUpdatedDate(LocalDateTime dateTime) {
        LocalDateTime updatedDateTime = dateTime.plusHours(11);
        System.out.println(updatedDateTime.toLocalDate());
    }
}