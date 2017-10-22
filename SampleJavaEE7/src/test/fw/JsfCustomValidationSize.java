package test.fw;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="jsfCustomSize")
public class JsfCustomValidationSize implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null) {
			return;
		}
		String text = value.toString();
		if (text.length() < 2 || text.length() > 5) {
			throw new ValidatorException(new FacesMessage("2文字以上、5文字以下で入力してください。"));
		}
	}

}
