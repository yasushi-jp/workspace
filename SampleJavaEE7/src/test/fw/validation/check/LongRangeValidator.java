package test.fw.validation.check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import test.fw.validation.anotation.LongRange;

public class LongRangeValidator implements ConstraintValidator<LongRange, Integer> {

	private int min;
	private int max;

	@Override
	public void initialize(LongRange longRange) {
		this.min = longRange.min();
		this.max = longRange.max();

	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		int i = value.intValue();
		if (i < min || i > max) {
			return false;
		}
		return true;
	}

}
