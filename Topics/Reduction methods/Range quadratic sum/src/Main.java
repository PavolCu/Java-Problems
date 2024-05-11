

import static java.util.stream.IntStream.range;

class QuadraticSum {
    public static long rangeQuadraticSum(int fromIncl, int toExcl) {
        return range(fromIncl, toExcl)
            .mapToLong(x -> (long) x * x)
            .sum();

        // write your code with streams here
    }
}