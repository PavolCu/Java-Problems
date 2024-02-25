import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        LocalDateTime dateTime = LocalDateTime.parse(input[0]);
        int daysToAdd = Integer.parseInt(input[1]);
        int hoursToSubtract = Integer.parseInt(input[2]);

        LocalDateTime updatedDateTime = dateTime.plusDays(daysToAdd).minusHours(hoursToSubtract);
        System.out.println(updatedDateTime);
    }
}