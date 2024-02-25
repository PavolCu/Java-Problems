import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            LocalDateTime dateTime = parseDateTime(scanner);
            int hoursToSubtract = scanner.nextInt();
            int minutesToAdd = scanner.nextInt();
            printUpdatedDateTime(dateTime, hoursToSubtract, minutesToAdd);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date-time format. Please use the format: 'yyyy-MM-ddTHH:mm:ss'");
        } finally {
            scanner.close();
        }
    }

    private static LocalDateTime parseDateTime(Scanner scanner) {
        String dateTimeString = scanner.nextLine();
        String[] parts = dateTimeString.split("T");
        String date = parts[0];
        String time = parts[1];
        String[] dateParts = date.split("-");
        String year = dateParts[0];
        while (year.length() < 4) {
            year = "0" + year;
        }
        dateParts[0] = year;
        date = String.join("-", dateParts);
        dateTimeString = date + "T" + time;
        return LocalDateTime.parse(dateTimeString);
    }

    private static void printUpdatedDateTime(LocalDateTime dateTime, int hoursToSubtract, int minutesToAdd) {
        LocalDateTime updatedDateTime = dateTime.minusHours(hoursToSubtract).plusMinutes(minutesToAdd);
        System.out.println(updatedDateTime);
    }
}