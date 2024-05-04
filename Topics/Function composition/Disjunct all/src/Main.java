import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

class CombiningPredicates {

    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     */
    public Optional<String> getValue() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return "empty".equals(input) ? Optional.empty() : Optional.of(input);
    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return n -> predicates.stream().anyMatch(predicate -> predicate.test(n));
    }
    // Don't change the code below

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(disjunctAll(predicates).test(0));
    }
}