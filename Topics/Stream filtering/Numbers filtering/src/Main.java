import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

class EvenAndOddFilter {

    private static final int DIVISOR_1 = 3;
    private static final int DIVISOR_2 = 5;
    private static final int SKIP_COUNT = 2;

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream)
                .filter(n -> n % DIVISOR_1 == 0 && n % DIVISOR_2 == 0)
                .sorted()
                .skip(SKIP_COUNT); // write your stream here
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(values)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(x -> x)
                .toArray();

        int[] oddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(x -> x)
                .toArray();

        IntStream filteringStream = createFilteringStream(
                Arrays.stream(evenNumbers),
                Arrays.stream(oddNumbers));

        System.out.println(filteringStream.boxed().collect(Collectors.toList()));
    }
}