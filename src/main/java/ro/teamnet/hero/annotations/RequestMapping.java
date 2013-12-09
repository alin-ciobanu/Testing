package ro.teamnet.hero.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;


@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
   public String value() default "";
}
