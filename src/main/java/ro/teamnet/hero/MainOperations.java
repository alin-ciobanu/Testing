package ro.teamnet.hero;

import ro.teamnet.hero.annotations.RequestMapping;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MainOperations {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class c = MathOperationsStatic.class;
        Constructor[] constr = c.getDeclaredConstructors();
        Constructor mainConstr = constr[0];
        if(!mainConstr.isAccessible()){
            mainConstr.setAccessible(true);
        }
        Object obj = mainConstr.newInstance();
        Method m = c.getDeclaredMethod("simpleAdd");
        System.out.println(m.invoke(obj));

        // getting annotation from method
        String annotationValue;
        RequestMapping a = (RequestMapping) m.getAnnotation(RequestMapping.class);
        annotationValue = a.value();
        System.out.println(annotationValue);
    }
}
