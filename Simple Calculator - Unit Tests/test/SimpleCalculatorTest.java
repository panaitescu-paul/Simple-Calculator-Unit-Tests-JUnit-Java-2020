// Author: Paul Panaitescu

import org.junit.Before;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }
    @org.junit.Test
    public void testAdd() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 1.5f;
        float n2 = 2.5f;
        float result;
        float expectedResult = 4.0f;

        // Execution steps - use the add() method
        result = this.calculator.add(n1, n2);

        // Expected behavior - assert that expectedResult (4.0f) is equal to result
        assertEquals(expectedResult, result);
    }

    @org.junit.Test
    public void testAdd2() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 1.5f;
        float n2 = 2.5f;
        float result;
        float expectedResult = 4.0f;
        float wrongResult = 5.5f;

        // Execution steps - use the add() method
        result = this.calculator.add(n1, n2);

        // Expected behavior - assert that expectedResult (4.0f) is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult (5.5f) is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testSubtract() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 5.0f;
        float n2 = 3.0f;
        float result;
        float expectedResult = 2.0f;
        float wrongResult = 3.5f;

        // Execution steps - use the subtract() method
        result = this.calculator.subtract(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testSubtract2() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 5.0f;
        float n2 = -3.0f;
        float result;
        float expectedResult = 8.0f;
        float wrongResult = 2.0f;

        // Execution steps - use the subtract() method
        result = this.calculator.subtract(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testSubtract3() {
        // Preconditions - n1 and n2 both have float values
        float n1 = -5.0f;
        float n2 = -1f;
        float result;
        float expectedResult = -4.0f;
        float wrongResult = -6.0f;

        // Execution steps - use the subtract() method
        result = this.calculator.subtract(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testMultiply() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 5.0f;
        float n2 = 5f;
        float result;
        float expectedResult = 25.0f;
        float wrongResult = 30.0f;

        // Execution steps - use the multiply() method
        result = this.calculator.multiply(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testMultiply2() {
        // Preconditions - n1 and n2 both have float values
        float n1 = -5.0f;
        float n2 = 5f;
        float result;
        float expectedResult = -25.0f;
        float wrongResult = 25.0f;

        // Execution steps - use the multiply() method
        result = this.calculator.multiply(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testMultiply3() {
        // Preconditions - n1 and n2 both have float values
        float n1 = -5.0f;
        float n2 = 0f;
        float result;
        float expectedResult = -0.0f;
        float wrongResult = 0.0f;

        // Execution steps - use the multiply() method
        result = this.calculator.multiply(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testDivide() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 5.0f;
        float n2 = 2f;
        float result;
        float expectedResult = 2.5f;
        float wrongResult = 2f;

        // Execution steps - use the divide() method
        result = this.calculator.divide(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testDivide2() {
        // Preconditions - n1 and n2 both have float values
        float n1 = -5.0f;
        float n2 = 2f;
        float result;
        float expectedResult = -2.5f;
        float wrongResult = 2.5f;

        // Execution steps - use the divide() method
        result = this.calculator.divide(n1, n2);

        // Expected behavior - assert that expectedResult is equal to result
        assertEquals(expectedResult, result);
        // Expected behavior - assert that wrongResult is NOT equal to result
        assertNotEquals(wrongResult, result);
    }

    @org.junit.Test
    public void testDivide3() {
        // Preconditions - n1 and n2 both have float values
        float n1 = 5.0f;
        float n2 = 0f;
        float result;

        // Execution steps - use the divide() method
        try {
            result = this.calculator.divide(n1, n2);

            fail("should throw an exception");
        } catch (ArithmeticException e){
            // Expected behavior - we get an error: "Cannot divide by zero."
            assertThat(e.getMessage(), containsString("Cannot divide by zero."));
            assertThat(e, instanceOf(ArithmeticException.class));
        }

    }
}
