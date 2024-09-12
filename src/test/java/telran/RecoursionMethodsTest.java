package telran;

import org.junit.jupiter.api.Test;

import telran.util.RecursionMethods;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.RecursionMethods.*;

public class RecoursionMethodsTest {
    @Test
    void ftest() {
        f(400);
    }
    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(-3));
    }
    @Test
    public void testPow() {
        assertEquals(1, RecursionMethods.pow(2, 0), "2^0 should be 1");
        assertEquals(2, RecursionMethods.pow(2, 1), "2^1 should be 2");
        assertEquals(4, RecursionMethods.pow(2, 2), "2^2 should be 4");
        assertEquals(8, RecursionMethods.pow(2, 3), "2^3 should be 8");
        assertEquals(9, RecursionMethods.pow(3, 2), "3^2 should be 9");
        assertEquals(27, RecursionMethods.pow(3, 3), "3^3 should be 27");
    
        assertEquals(0, RecursionMethods.pow(0, 3), "0^3 should be 0");
    
        assertEquals(100, RecursionMethods.pow(10, 2), "10^2 should be 100");
    
        assertThrows(UnsupportedOperationException.class, () -> RecursionMethods.pow(2, -1), "Negative degree should throw exception");
    }
    @Test
    void sumTest() {
        int[] ar = {1, 2, 3, 4, 5};
        assertEquals(15, sum(ar));
    }
    
    @Test
    void testSquare() {
        assertEquals(0, RecursionMethods.square(0), "Square of 0 should be 0");
        assertEquals(1, RecursionMethods.square(1), "Square of 1 should be 1");
        assertEquals(4, RecursionMethods.square(2), "Square of 2 should be 4");
        assertEquals(9, RecursionMethods.square(3), "Square of 3 should be 9");
        assertEquals(16, RecursionMethods.square(4), "Square of 4 should be 16");
        assertEquals(25, RecursionMethods.square(5), "Square of 5 should be 25");

        assertEquals(9, RecursionMethods.square(-3), "Square of -3 should be 9");
        assertEquals(4, RecursionMethods.square(-2), "Square of -2 should be 4");
    }

    @Test
    void testIsSubstring() {

        assertTrue(RecursionMethods.isSubstring("hello", "hell"), "'hell' should be a substring of 'hello'");
        assertTrue(RecursionMethods.isSubstring("hello", "lo"), "'lo' should be a substring of 'hello'");
        assertTrue(RecursionMethods.isSubstring("hello", ""), "Empty string should be a substring of any string");

        assertFalse(RecursionMethods.isSubstring("hello", "world"), "'world' is not a substring of 'hello'");
        assertFalse(RecursionMethods.isSubstring("hello", "helloworld"), "'helloworld' is not a substring of 'hello'");
        assertFalse(RecursionMethods.isSubstring("hello", "HELLO"), "'HELLO' should not be a substring of 'hello' (case-sensitive)");
    }
}