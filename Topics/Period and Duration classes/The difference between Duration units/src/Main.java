import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Duration> durations = createDurationList(scanner);

        Duration result = getMaxMinusAvg(durations);

        System.out.println(result);
    }

    public static List<Duration> createDurationList(Scanner scanner) {
        List<Duration> list = new ArrayList<>();
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.DAYS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.HOURS));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.MINUTES));
        list.add(Duration.of(scanner.nextInt(), ChronoUnit.SECONDS));

        return list;
    }

    public static Duration getMaxMinusAvg(List<Duration> durations) {
        Duration total = Duration.ZERO;
        Duration max = Duration.ZERO;

        for (Duration duration : durations) {
            total = total.plus(duration);
            if (duration.compareTo(max) > 0) {
                max = duration;
            }
        }

        Duration avg = total.dividedBy(durations.size());

        return max.minus(avg);
    }
}