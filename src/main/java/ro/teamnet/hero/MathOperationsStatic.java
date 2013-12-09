package ro.teamnet.hero;

import ro.teamnet.hero.annotations.RequestMapping;

import java.math.BigDecimal;


public class MathOperationsStatic {
    private MathOperationsStatic() {
       //throw new RuntimeException("Este un util");
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    @RequestMapping(value = "deAfisat")
    public Integer simpleAdd(){
        return 1+1;
    }


}
