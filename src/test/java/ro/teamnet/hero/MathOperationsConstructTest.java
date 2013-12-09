package ro.teamnet.hero;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class MathOperationsConstructTest {

    MathOperationsConstruct mathOperationsConstruct;

    @Before
    public void setUp() throws Exception {
        mathOperationsConstruct =
                new MathOperationsConstruct(new BigDecimal(20), new BigDecimal(4));
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(24), mathOperationsConstruct.add());
    }

    @Test
    public void testSubstract() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(16), mathOperationsConstruct.substract());
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(80), mathOperationsConstruct.multiply());
    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(BigDecimal.valueOf(5), mathOperationsConstruct.divide());
    }
}
