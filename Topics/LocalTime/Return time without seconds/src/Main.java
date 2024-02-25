import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.parse(scanner.nextLine());
        scanner.close();

        LocalTime timeWithoutSeconds = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(timeWithoutSeconds);
    }
}