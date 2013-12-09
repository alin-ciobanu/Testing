package ro.teamnet.hero;

import java.math.BigDecimal;


public class MathOperations {

    public BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    public BigDecimal substract(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b){
       return a.multiply(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b){
        return a.divide(b);
    }
}
