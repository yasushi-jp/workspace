package test.fw.validation.check;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import test.fw.validation.anotation.Size;

public class SizeValidator implements ConstraintValidator<Size, String> {

	private int min;
	private int max;

	@Override
	public void initialize(Size constraintAnotation) {
		this.min = constraintAnotation.min();
		this.max = constraintAnotation.max();

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		if (value.length() < min || value.length() > max) {
			return false;
		}
		return true;
	}

}
