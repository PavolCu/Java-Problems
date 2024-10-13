import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTime1 = scanner.nextLine();
        String dateTime2 = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime start = LocalDateTime.parse(dateTime1, formatter);
        LocalDateTime end = LocalDateTime.parse(dateTime2, formatter);

        long hoursBetween = ChronoUnit.HOURS.between(start, end);

        System.out.println(hoursBetween);
    }
}