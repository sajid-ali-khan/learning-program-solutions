
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {
    @Test
    public void testAreaCalculator(){
        AreaCalculator areaCalculator = new AreaCalculator();
        double area = areaCalculator.squareArea(15);
        assertEquals(225,area);
    }
}