package beans;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target({
	ElementType.METHOD,
	ElementType.FIELD,
	ElementType.ANNOTATION_TYPE
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdPatternValidator.class)
public @interface IdPattern {
	String message() default "{beans.IdPattern}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	String item() default "項目";
	int from() default 2000;
	int to() default 2010;
}
