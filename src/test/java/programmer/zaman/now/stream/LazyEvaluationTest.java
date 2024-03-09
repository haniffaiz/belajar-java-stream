package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;


/// stream tidak seperti collection.
///menyelesaikan dulu 1 element
public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Hanif","Faiz","Hidayat");

        Stream<String> upper = names.stream()
                .map(name->{
                    System.out.println("Change "+name+"to UPPERCASE");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Hanif","Faiz","Hidayat");

        names.stream()
                .map(name->{
                    System.out.println("Change "+name+" to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper->{
                    System.out.println("Change "+upper+" to MR.");
                    return "Mr."+upper;
                })
                .forEach(mr->{
                    System.out.println(mr);
                });

    }
}
