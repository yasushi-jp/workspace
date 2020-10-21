package test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({
	ElementType.TYPE,
	ElementType.METHOD,
	ElementType.FIELD,
})
@Retention(RetentionPolicy.RUNTIME)
public @interface SampleAnnotation {
	String id() default "00";
	String name();
}
