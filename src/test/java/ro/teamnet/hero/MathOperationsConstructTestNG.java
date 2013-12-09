package ro.teamnet.hero;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class MathOperationsConstructTestNG {

    private BigDecimal a;
    private BigDecimal b;
    MathOperations mathOperations;

    @BeforeMethod
    public void setUp() throws Exception {
        mathOperations = new MathOperations();
        a = BigDecimal.valueOf(12);
        b = BigDecimal.valueOf(3);
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(15), mathOperations.add(a, b));
    }

    @Test
    public void testSubstract() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(9), mathOperations.substract(a, b));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(36), mathOperations.multiply(a, b));
    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(4), mathOperations.divide(a, b));
    }
}
