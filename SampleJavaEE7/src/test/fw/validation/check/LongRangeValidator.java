package test.fw.validation.check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import test.fw.validation.anotation.LongRange;

public class LongRangeValidator implements ConstraintValidator<LongRange, String> {

	private int min;
	private int max;

	@Override
	public void initialize(LongRange constraintAnotation) {
		this.min = constraintAnotation.min();
		this.max = constraintAnotation.max();

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		int i = Integer.parseInt(value);
		if (i < min || i > max) {
			return false;
		}
		return true;
	}

}
