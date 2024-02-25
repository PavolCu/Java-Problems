import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            LocalDateTime dateTime = parseDateTime(scanner);
            int minutesToAdd = parseMinutes(scanner);
            printUpdatedDateTime(dateTime, minutesToAdd);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date-time format. Please use the format: 'yyyy-MM-ddTHH:mm:ss'");
        } finally {
            scanner.close();
        }
    }

    private static LocalDateTime parseDateTime(Scanner scanner) {
        return LocalDateTime.parse(scanner.nextLine());
    }

    private static int parseMinutes(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void printUpdatedDateTime(LocalDateTime dateTime, int minutesToAdd) {
        LocalDateTime updatedDateTime = dateTime.plusMinutes(minutesToAdd);
        String result = formatDateTime(updatedDateTime);
        System.out.println(result);
    }

    private static String formatDateTime(LocalDateTime dateTime) {
        String result = dateTime.getYear() + " " + dateTime.getDayOfYear() + " " + String.format("%02d:%02d", dateTime.getHour(), dateTime.getMinute());
        if (dateTime.getSecond() != 0) {
            result += ":" + String.format("%02d", dateTime.getSecond());
        }
        return result;
    }
}