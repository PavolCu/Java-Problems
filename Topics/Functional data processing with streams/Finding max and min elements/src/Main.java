import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.sorted(order).collect(Collectors.toList());
        T min = list.isEmpty() ? null : list.get(0);
        T max = list.isEmpty() ? null : list.get(list.size() - 1);
        minMaxConsumer.accept(min, max);
    }
}