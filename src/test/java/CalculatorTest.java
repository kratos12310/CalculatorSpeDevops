import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double theta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRootTrue_Positive() {
        assertEquals("Test case for True Positive for squareRoot", 4.0, c.sq_root(16.0), theta);
        assertEquals("Test case for True Negative for squareRoot", Double.NaN, c.sq_root(-16.0), theta);
    }

    @Test
    public void squareRootFalse_Negative() {
        assertNotEquals("Test case for False Negative for squareRoot", 4.0, c.sq_root(-16.0), theta);
        assertNotEquals("Test case for False Positive for squareRoot", Double.NaN, c.sq_root(16.0), theta);
    }

    @Test
    public void factorialTrue_Positive() {
        assertEquals("Test case for True Positive for factorial", 24.0, c.factorial(4), theta);
        assertEquals("Test case for True Negative for factorial", Double.NaN, c.factorial(-4), theta);

    }
    @Test
    public void factorialFalse_Negative() {
        assertNotEquals("Test case for False Negative for factorial", 4.0, c.factorial(-4), theta);
        assertNotEquals("Test case for False Positive for factorial", Double.NaN, c.factorial(4), theta);
    }
    @Test
    public void logarithmTrue_Positive() {
        assertEquals("Test case for True Positive for logarithm", 1.3862943611198906, c.logarithm(4.0), theta);
        assertEquals("Test case for True Negative for logarithm", Double.NaN, c.logarithm(-4.0), theta);
    }
    @Test
    public void logarithmFalse_Negative() {
        assertNotEquals("Test case for False Negative for logarithm", 4.0, c.logarithm(-4.0), theta);
        assertNotEquals("Test case for False Positive for logarithm", Double.NaN, c.logarithm(4.0), theta);
    }
    @Test
    public void powerTrue_Positive() {
        assertEquals("Test case True Positive for PowerFunction", 25.0, c.power(5.0, 2.0), theta);
        assertEquals("Test case True Negative for PowerFunction", 0.25, c.power(2.0, -2.0), theta);
    }

    @Test
    public void powerFalse_Negative() {
        assertNotEquals("Test case for False Negative for PowerFunction", 4.0, c.power(1.0, 4.0), theta);
        assertNotEquals("Test case for False Positive for PowerFunction", 4.0, c.power(2.0, 4.0), theta);
    }

}
