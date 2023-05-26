package hexlet.gradle.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class SomeClassTest {

        @Test
        public void testSum() {
            var expected = 5;
            var actual = SomeClass.sum(3, 2);
            assertEquals(expected, actual);
        }
    }
