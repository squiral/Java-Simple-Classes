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
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(12, calculator.subtract(15, 3));
    }
}
