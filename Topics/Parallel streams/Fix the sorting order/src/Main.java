import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class ParallelMapping {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.stream(SCANNER.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.stream()
                .sorted()
                .parallel()
                .map(n -> n * 2)
                .forEachOrdered(System.out::println);
    }
}