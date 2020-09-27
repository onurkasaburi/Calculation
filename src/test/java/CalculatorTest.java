import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddingNumber() {
        int result = 5 + 10;
        Assert.assertEquals(15, result);
    }

    @Test
    public void testAddingNumber2() {
        int result = 3 + 7;
        Assert.assertEquals(10, result);
    }

    @Test
    public void testAddingNumber3() {
        int result = Calculator.sum(25, 40);
        Assert.assertEquals(65, result);
    }

    @Test
    public void testAddingByCalculator() {

        int result = Calculator.sum(5, 3);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testTakingOffNumbers() {
        int result = Calculator.minus(11, 7);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void testTakingOffNumbers2() {
        int result = Calculator.minus(22, 14);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testTakingOffNumbers3() {
        int result = Calculator.minus(-35, -17);
        Assert.assertEquals(result, -18);
    }

    @Test
    public void testTakingOffNumbers4() {
        int result = Calculator.minus(-100, -88);
        Assert.assertEquals(result, -12);
    }

    @Test
    public void testMultiplyingNumbers() {
        int result = Calculator.multiply(6, 4);
        Assert.assertEquals(24, result);
    }

    @Test
    public void testMultiplyingNumbers2() {
        int result = Calculator.multiply(20, 30);
        Assert.assertEquals(600, result);
    }

    @Test
    public void testMultiplyingNumbers3() {
        int result = Calculator.multiply(-3, -7);
        Assert.assertEquals(21, result);
    }

    @Test
    public void testMultiplyingNumbers4() {
        int result = Calculator.multiply(-10, 10);
        Assert.assertEquals(-100, result);
    }

    @Test
    public void testDividingNumbers() {
        int result = Calculator.divide(22, 2);
        Assert.assertEquals(11, result);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDividingNumbers2() {
        Calculator.divide(5, 0);

    }

    @Test
    public void testDividingNumbers3() {
        int result = Calculator.divide(-12, -3);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testDividingNumbers4() {
        int result = Calculator.divide(-30, 5);
        Assert.assertEquals(-6, result);
    }
}
