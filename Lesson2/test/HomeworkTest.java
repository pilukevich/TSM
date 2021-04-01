import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

class HomeworkTest {

    @Test
    void sum() {
        Assertions.assertEquals(6, Homework.sum(2, 4));
        Assertions.assertEquals(-2, Homework.sum(-2,0));
        Assertions.assertEquals(0, Homework.sum(0,0));
        Assertions.assertEquals(-79, Homework.sum(-2,-77));
        Assertions.assertEquals(-1, Homework.sum(MAX_VALUE, MAX_VALUE));
        Assertions.assertEquals((long) MIN_VALUE + MIN_VALUE, Homework.sum(MIN_VALUE, MIN_VALUE));
    }

    @Test
    void max() {
    }

    @Test
    void sum2() {
    }

    @Test
    void testMax() {
    }
}