import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        LocalTime time2 = LocalTime.parse(scanner.nextLine());
        scanner.close();

        System.out.println(getSecondsBetween(time1, time2));
    }

    public static long getSecondsBetween(LocalTime time1, LocalTime time2) {
        Duration duration = Duration.between(time1, time2);
        return Math.abs(duration.getSeconds());
    }
}