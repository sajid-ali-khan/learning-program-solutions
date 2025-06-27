import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AreaCalculatorTest {
    @Test
    public void testAreaCalculator(){
        AreaCalculator areaCalculator = new AreaCalculator();
        double area = areaCalculator.squareArea(15);
        assertEquals(225,area);
    }
}