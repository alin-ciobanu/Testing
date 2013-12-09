package ro.teamnet.hero;

import java.math.BigDecimal;

public class MathOperationsConstruct {

    private BigDecimal a;
    private BigDecimal b;

    public MathOperationsConstruct(BigDecimal a, BigDecimal b) {
        assert a!=null;
        assert b!=null;
        this.a = a;
        this.b = b;
    }

    public BigDecimal add(){
        return a.add(b);
    }

    public BigDecimal substract(){
        return a.subtract(b);
    }

    public BigDecimal multiply(){
        return a.multiply(b);
    }

    public BigDecimal divide(){
        return a.divide(b);
    }

}
