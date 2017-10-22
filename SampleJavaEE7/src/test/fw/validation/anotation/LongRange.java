package test.fw.validation.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import test.fw.validation.check.LongRangeValidator;

@Documented
@Target({ElementType.METHOD,
		ElementType.FIELD,
		ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR,
		ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {LongRangeValidator.class})
public @interface LongRange {
	String message() default "以上、以下で入力してください。";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
//	@Target({ElementType.METHOD,
//		ElementType.FIELD,
//		ElementType.ANNOTATION_TYPE,
//		ElementType.CONSTRUCTOR,
//		ElementType.PARAMETER})
//	@Retention(RetentionPolicy.RUNTIME)
//	@Documented
//	@interface List {
//		LongRange[] value();
//	}
	int min() default 10;
	int max() default 100;
}
