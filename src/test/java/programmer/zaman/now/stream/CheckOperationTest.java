package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {

    //Jika salah 1 terpenuhi maka true
    @Test
    void testAnyMatch() {
        boolean match =  List.of(1,21,3,4,5,6,7,8,9,10).stream()
                .anyMatch(number->number>20);
        System.out.println(match);
    }

    //harus semua match maka true
    @Test
    void testAllMatch() {
        boolean match =  List.of(1,21,3,4,5,6,7,8,9,10).stream()
                .allMatch(number->number>20);
        System.out.println(match);
    }

    //tidak boleh match maka true
    @Test
    void testNoneMatch() {
        boolean match =  List.of(1,21,3,4,5,6,7,8,9,10).stream()
                .noneMatch(number->number>100);
        System.out.println(match);
    }

}
