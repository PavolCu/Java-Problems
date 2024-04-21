import java.util.function.*;

class Operator {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return argument -> condition.test(argument) ? ifTrue.apply(argument) : ifFalse.apply(argument);

    }
}