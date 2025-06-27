import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    static Calculator calculator = new Calculator();
    @Test
    void testAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testDivide(){
        assertEquals(1, calculator.divide(2, 2));
        assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
        assertNotEquals(2, calculator.divide(2, 2));
    }
}