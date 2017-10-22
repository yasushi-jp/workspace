package test.fw.validation.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import test.fw.validation.check.SizeValidator;

@Documented
@Target({ElementType.METHOD,
		ElementType.FIELD,
		ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR,
		ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {SizeValidator.class})
public @interface Size {
	String message() default "文字以上、文字以下で入力してください。";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
//	@Target({ElementType.METHOD,
//		ElementType.FIELD,
//		ElementType.ANNOTATION_TYPE,
//		ElementType.CONSTRUCTOR,
//		ElementType.PARAMETER})
//	@Retention(RetentionPolicy.RUNTIME)
//	@interface List {
//		Size[] value();
//	}
	int min() default 2;
	int max() default 5;
}
