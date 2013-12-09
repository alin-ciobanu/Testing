package ro.teamnet.hero;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


public class MathOperationsTest {

    private BigDecimal a;
    private BigDecimal b;
    MathOperations mathOperations;

    @Before
    public void setUp() throws Exception {
        b=BigDecimal.ZERO;
        a=BigDecimal.TEN;
        mathOperations=
                new MathOperations();
    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(BigDecimal.ZERO, mathOperations.divide(b, a));
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(BigDecimal.TEN, mathOperations.add(a, b));
    }

    @Test
    public void testSubstract() throws Exception {
        Assert.assertEquals(BigDecimal.TEN, mathOperations.substract(a, b));
    } 
    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(BigDecimal.ZERO, mathOperations.multiply(a, b));
    }
}
