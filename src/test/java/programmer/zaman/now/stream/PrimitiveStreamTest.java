package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {

    @Test
    void testCreate() {

        IntStream intStream = IntStream.range(1,100);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(1,100);
        longStream.forEach(System.out::println);

    }

    @Test
    void testOperation() {

        IntStream intStream = IntStream.range(1,100);
        OptionalDouble optionalDouble =  intStream.average();
        optionalDouble.ifPresent(System.out::println);

        IntStream.range(0,100)
                .mapToObj(number->"Number : " + number)
                .forEach(System.out::println);
    }
}
