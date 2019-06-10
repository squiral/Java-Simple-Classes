import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5.0, calculator.add(2.00, 3.00), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(12.0, calculator.subtract(15.00, 3.00), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(20.0, calculator.multiply(5.00, 4.00), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(4.00, calculator.divide(8.00, 2.00), 0.01);
    }
}
