package test.fw;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class JsfCustomValidationLongRange implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null) {
			return;
		}
		if (value instanceof Integer) {
			int i = ((Integer) value).intValue();
			if (i < 10 || i > 100) {
				throw new ValidatorException(new FacesMessage("10以上、100以下で入力してください。"));
			}
		} else if (value instanceof Long) {
			long l = ((Long) value).longValue();
			if (l < 10 || l > 100) {
				throw new ValidatorException(new FacesMessage("10以上、100以下で入力してください。"));
			}
		} else {
			throw new ValidatorException(new FacesMessage("10以上、100以下で入力してください。"));
		}
	}
}
