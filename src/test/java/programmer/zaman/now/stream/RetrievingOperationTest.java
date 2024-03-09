package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Hanif","Faiz", "Hidayat","Haikal","Aziz").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Hanif","Faiz", "Hidayat","Haikal","Aziz").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Hanif","Faiz", "Hidayat","Haikal","Aziz").stream()
                .takeWhile(name->name.length()<=5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Hanif","Faiz", "Hidayat","Haikal","Aziz").stream()
                .dropWhile(name->name.length()<=5)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional =  List.of("Hanif","Faiz", "Hidayat","Haikal","Aziz").stream()
                .findAny();

        optional.ifPresent(name->{
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional =  List.of("Hanif","Faiz", "Hidayat","Haikal","Aziz").stream()
                .findFirst();

        optional.ifPresent(name->{
            System.out.println(name);
        });
    }
}
