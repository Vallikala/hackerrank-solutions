package oracle.ocp.optional;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalTest {

    public static void main(String args[]) {

        Optional<Integer> optionalInteger = Optional.of(9);

        optionalInteger.filter(p -> p > 8).ifPresent(System.out::println);
        optionalInteger.filter(x -> Integer.compare(12, x) > 0).ifPresent(System.out::println);

        System.out.println(Integer.compare(8, optionalInteger.get()));


        Optional<String> opString = Optional.of("45");
        Optional<Integer> opInt1 = opString.map(n -> Integer.decode(n));
                         // <U> Optional<U> map(Function<? super T, ? extends U> mapper)

        System.out.println(opInt1);


        Optional<String> opString2 = Optional.of("65");
        Optional<Integer> opInt2 = opString2.flatMap(n -> Optional.of(Integer.decode(n)));
                          // <U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper)

        System.out.println(opInt2);

        Optional<String> opDate = Optional.of("2019-09-18");

        Optional<LocalDate> optionalLocalDate = opDate.map(d -> LocalDate.parse(d));

        optionalLocalDate.ifPresent(System.out::println);

    }

}
