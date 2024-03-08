package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Hanif");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        oneStream.forEach(item -> {
            System.out.println(item);
        });

    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Hanif","Faiz", "Hidayat");
        arrayStream.forEach(name -> {
            System.out.println(name);
        });

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Hanif","Faiz", "Hidayat"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);


    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Hanif", "Faiz", "Hidayat");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
        //stream tidak bisa 2 kali
        //stringStream.forEach(System.out::println);

    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Hanif Faiz Hidayat");
//        stream.forEach(System.out::println);

        Stream<String> iterate = Stream.iterate(1, value -> value + 1);
//        iterate.forEach(System.out::println);
    }
}
