package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeek() {
        List.of("Hanif", "Faiz", "Hidayat").stream()
                .map(name->{
                    System.out.println("Before Change Name to Upper : "+name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : "+upper);
                    return upper;
                })
                .forEach(name-> System.out.println("Final Name : "+name));

    }

    //menggunakan peek
    @Test
    void testPeekAfter() {
        List.of("Hanif", "Faiz", "Hidayat").stream()
                .peek(name->System.out.println("Before Change Name to Upper : "+name))
                .map(name->name.toUpperCase())
                .peek(upper->System.out.println("Change Name to Upper : "+upper))
                .forEach(name-> System.out.println("Final Name : "+name));

    }
}
